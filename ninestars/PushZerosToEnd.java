package ninestars;

public class PushZerosToEnd {

	public static int[] pushzero(int[] input1, int input2) {
		int[] result = new int[input2]; // New array of same size
		int index = 0; // Track position for non-zero elements

		// First, add all non-zero elements
		for (int i = 0; i < input2; i++) {
			if (input1[i] != 0) {
				result[index++] = input1[i];
			}
		}

		// Remaining positions will already be 0 (default in Java arrays)
		return result;
	}

	public static void main(String[] args) {
		int n = 4;
		int[] a = {5, 0, 7, 6};
		int[] x = pushzero(a, n);

		for (int i : x) {
			System.out.print(i + " ");
		}
	}
}
