package vinnovate_labs;

public class SteveString {

	public static String remove(String s) {
		StringBuilder stack = new StringBuilder();

		for (char ch : s.toCharArray()) {
			int len = stack.length();
			if (len > 0 && stack.charAt(len - 1) == ch) {
				stack.deleteCharAt(len - 1);  // Remove last character if it's the same as `ch`
			} else {
				stack.append(ch);  // Otherwise, add it to the stack
			}
		}

		return stack.toString();
	}

	public static void main(String[] args) {
		String a = "aaabbcddd";
		System.out.println(remove(a)); // Output: "bc"
	}
}
