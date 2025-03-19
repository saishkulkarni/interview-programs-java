package slk;

public class WeddingGame {
	static int minimumSets(String input1, int input2, int input3) {
		int count = 0; // Stores number of valid sets
		int num = 0;   // Stores current number

		for (int i = 0; i < input2; i++) {
			int digit = input1.charAt(i) - '0';

			// Append digit and check validity
			if (num * 10 + digit <= input3) {
				num = num * 10 + digit; // Append next digit
			} else {
				count++; // Complete previous valid partition
				num = digit; // Start new partition
			}
		}

		// Count the last partition
		if (num != 0) {
			count++;
		}

		return count;
	}

	public static void main(String args[]) {
		String s = "1234";
		int maxValue = 30; // Set a meaningful maximum value
		System.out.println(minimumSets(s, s.length(), maxValue));
	}
}
