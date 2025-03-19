package general;

public class MaxLengthofAdjacentChar {

	public static int findAnswer(String x) {
		if (x.isEmpty()) return 0; // Handle empty string

		char[] arr = x.toCharArray();
		int max = 1;
		int count = 1;

		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] == arr[i + 1]) {
				count++;
			} else {
				count = 1; // Reset count for a new character
			}
			max = Math.max(max, count); // Update max correctly
		}

		return max;
	}

	public static void main(String[] args) {
		String x = "cabbcccddbbx";
		System.out.println(findAnswer(x)); // Output: 3 (for 'ccc')
	}
}
