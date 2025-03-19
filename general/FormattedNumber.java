package general;

import java.util.Scanner;

/**
 * This program checks if a given input string is a properly formatted number.
 *
 * Valid formats:
 * - Digits only (e.g., "123")
 * - Digits with commas (e.g., "1,234")
 * - Decimal numbers (e.g., "123.45")
 * - Combination of commas and decimal (e.g., "1,234.56")
 *
 * Invalid formats:
 * - More than one decimal point (e.g., "12.34.56")
 * - Non-numeric characters (e.g., "123abc")
 * - Incorrect comma placement (e.g., ",123")
 */

public class FormattedNumber {

	/**
	 * Checks if the given string is a properly formatted number.
	 *
	 * @param input The string to be checked.
	 * @return true if the input is a valid formatted number, otherwise false.
	 */
	public static boolean checkNumber(String input) {
		int decimalCount = 0;  // Counter for decimal points
		boolean isValid = false;

		for (int i = 0; i < input.length(); i++) {
			char ch = input.charAt(i);

			if (ch == '.') {
				decimalCount++;  // Track number of decimal points
			}

			// Ensure the character is either a digit, comma, or a decimal (.)
			if (Character.isDigit(ch) || ch == ',' || ch == '.') {
				isValid = true;
			} else {
				isValid = false;
				break; // Invalid character found, exit loop
			}
		}

		// If more than one decimal point is found, it's invalid
		if (decimalCount > 1) {
			isValid = false;
		}

		return isValid;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter a number: ");
		String s1 = scanner.next();  // Read user input

		System.out.println("Is valid number? " + checkNumber(s1));

		scanner.close();
	}
}
