package general;

public class Panagram {
	public static boolean isPangram(String str) {
		boolean[] alphabet = new boolean[26]; // Track letters A-Z
		str = str.toLowerCase(); // Convert to lowercase

		int count = 0; // Count unique letters
		for (char ch : str.toCharArray()) {
			if (ch >= 'a' && ch <= 'z') {
				int index = ch - 'a';
				if (!alphabet[index]) { // Mark letter as found
					alphabet[index] = true;
					count++;
				}
			}
		}
		return count == 26; // Return true if all letters are found
	}

	public static void main(String[] args) {
		String input = "The quick brown fox jumps over the lazy dog";
		System.out.println("Is Pangram? " + isPangram(input)); // ✅ True

		String notPangram = "Hi this is Saish";
		System.out.println("Is Pangram? " + isPangram(notPangram)); // ❌ False
	}
}
