package general;

import java.util.Arrays;

public class RabbitsMeeting {
	public static int minimum(int n, int[] x) {
		if (n < 2) {
			return 0; // Not enough rabbits to compare distances
		}

		int minValue = Integer.MAX_VALUE;
		Arrays.sort(x); // Sort the array to ensure correct order

		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) { // Avoid duplicate pairs
				int z = x[j] - x[i];
				if (z % 2 != 0) { // Check if the difference is odd
					minValue = Math.min(minValue, z);
				}
			}
		}

		return (minValue == Integer.MAX_VALUE) ? 0 : minValue;
	}

	public static void main(String[] args) {
		int n = 3;
		int[] x = {2, 4, 6}; // Example input

		System.out.println("Minimum odd difference: " + minimum(n, x));
	}
}
