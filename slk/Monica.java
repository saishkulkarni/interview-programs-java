package slk;

import java.util.Arrays;

public class Monica {

	public static int MonicaMethod(int input1, int[] input2) {
		Arrays.sort(input2);  // Sort the array in ascending order
		int res = 0, total = 0;

		// Traverse from the largest element to the smallest
		for (int i = input1 - 1; i >= 0; --i) {
			total += input2[i];
			if (total >= 0) { // Only add to result if total remains non-negative
				res += total;
			} else {
				break; // Stop if total becomes negative
			}
		}
		return res;
	}

	public static void main(String[] args) {
		int[] a = {-1, 3, 4};
		int x = 3;
		System.out.println(MonicaMethod(x, a)); // Expected output: 10
	}
}
