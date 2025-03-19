package general;

import java.util.Scanner;

public class MonthName {
	public static String findMonthName(int n) {
		String[] months = { "January", "February", "March", "April", "May", "June", "July", "August",
				"September", "October", "November", "December" };

		return (n >= 1 && n <= 12) ? months[n - 1] : "Invalid Number";
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter month number (1-12): ");
		int monthNumber = scanner.nextInt();
		System.out.println("Month: " + findMonthName(monthNumber));
		scanner.close();
	}
}
