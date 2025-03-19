package ninestars;

public class NumberSum {

	public static int numberSum(int input1, int[] input2) {
		// Initialize min and max with extreme values
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;

		// Iterate once to find min and max
		for (int num : input2) {
			if (num < min) min = num;
			if (num > max) max = num;
		}

		return min + max; // Return sum of smallest and largest
	}

	public static void main(String[] args) {
		int n = 7;
		int[] a = {7, 2, 6, 15, 54, 10, 23};
		System.out.println(numberSum(n, a)); // Expected Output: 2 + 54 = 56
	}
}
