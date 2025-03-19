package general;

public class StringChallenge {
	public static void main(String[] args) {
		String s = "hello*3";
		System.out.println(stringChallenge(s));
	}

	public static String stringChallenge(String str) {
		String token = "yvuga1ch3d";
		StringBuilder res = new StringBuilder();
		StringBuilder ans = new StringBuilder();

		// Step 1: Increment alphabetic characters
		for (char c : str.toCharArray()) {
			if (Character.isAlphabetic(c)) {
				if (c == 'z') {
					c = 'a';
				} else if (c == 'Z') {
					c = 'A';
				} else {
					c++;
				}
			}
			res.append(c);
		}

		// Step 2: Append token
		res.append(token);

		// Step 3: Replace every 3rd character with 'X'
		for (int i = 0; i < res.length(); i++) {
			if ((i + 1) % 3 == 0) {  // Every 3rd character
				ans.append('X');
			} else {
				ans.append(res.charAt(i));
			}
		}

		return ans.toString();
	}
}
