package general;

public class ShinyIceCream {
	static void findMinimumMaximum(int[] arr) {
		int min = arr[0], max = arr[0];

		for (int num : arr) {
			if (num < min) {
				min = num;
			}
			if (num > max) {
				max = num;
			}
		}

		System.out.println("Minimum: " + min);
		System.out.println("Maximum: " + max);
	}

	public static void main(String[] args) {
		int[] arr = {1, 7, 6, 9, 8, 3, 5};
		findMinimumMaximum(arr);
	}
}
