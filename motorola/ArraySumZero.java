package motorola;

import java.util.Arrays;

public class ArraySumZero {
	public int[] solution(int N) {
		int[] arr = new int[N];

		// Filling array with balanced numbers
		int index = 0;
		for (int i = 1; i <= N / 2; i++) {
			arr[index++] = i;
			arr[index++] = -i;
		}

		// If N is odd, add a zero in the middle
		if (N % 2 != 0) {
			arr[index] = 0;
		}

		return arr;
	}

	public static void main(String[] args) {
		int n = 7;  // Try with even and odd numbers
		ArraySumZero arraySumZero = new ArraySumZero();
		int[] arr = arraySumZero.solution(n);

		// Print the array
		System.out.println(Arrays.toString(arr));
	}
}
