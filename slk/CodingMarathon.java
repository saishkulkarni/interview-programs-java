package slk;

import java.util.Arrays;

public class CodingMarathon {

	public static int result(int n, int k, int[] x) {
		Arrays.sort(x); // Sort the array directly

		int sum = 0;
		for (int i = n - 1; i >= n - k; i--) { // Pick the top 'k' largest elements
			sum += x[i];
		}

		return sum;
	}

	public static void main(String[] args) {
		int n = 4;
		int k = 2;
		int[] x = {4, 1, 2, 5};

		System.out.println(result(n, k, x)); // Expected output: 9 (5 + 4)
	}
}
