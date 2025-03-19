package infosys;

public class StringRemoveCharacter {
	public static int solve(String s) {
		if (s.length() <= 1) {
			return 0;
		}

		// Step 1: Find the first repeating character
		char repeatedChar = '\0';
		for (int i = 0; i < s.length() - 1; i++) {
			if (s.charAt(i) == s.charAt(i + 1)) {
				repeatedChar = s.charAt(i);
				break;
			}
		}

		// Step 2: If no repeated character is found, return length - 2
		if (repeatedChar == '\0') {
			return s.length() - 2;
		}

		// Step 3: Remove all occurrences of `repeatedChar`
		StringBuilder temp = new StringBuilder();
		for (char c : s.toCharArray()) {
			if (c != repeatedChar) {
				temp.append(c);
			}
		}

		// Step 4: Compute the remaining count
		int count = temp.length();
		return count;
	}

	public static void main(String[] args) {
		String s = "zewmyde";
		System.out.println(solve(s)); // Expected Output
	}
}
