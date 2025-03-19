package general;

public class MessageKey {

	public static void simple(String message, int key) {
		String keyStr = new StringBuilder(String.valueOf(key)).reverse().toString(); // Reverse key
		String mes = message.toUpperCase();
		int keyLength = keyStr.length();

		for (int i = 0; i < mes.length(); i++) {
			char ch = mes.charAt(i);

			if (ch < 'A' || ch > 'Z') { // Ignore non-alphabet characters
				System.out.print(ch);
			} else {
				int letterValue = ch - 'A' + 1;
				int keyValue = Character.getNumericValue(keyStr.charAt(i % keyLength)); // Cycle key digits
				System.out.print(letterValue + keyValue);
			}

			if (i < mes.length() - 1) {
				System.out.print(",");
			}
		}
	}

	public static void main(String[] args) {
		String message = "start";
		int key = 13571;
		simple(message, key);
	}
}
