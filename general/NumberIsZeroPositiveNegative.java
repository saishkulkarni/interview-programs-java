package general;

import java.util.Scanner;

public class NumberIsZeroPositiveNegative {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int pos = 0, neg = 0, zero = 0;

		while (true) {
			System.out.print("Enter a number: ");

			// Input validation
			if (!scanner.hasNextInt()) {
				System.out.println("Invalid input! Please enter an integer.");
				scanner.next(); // Clear invalid input
				continue;
			}

			int a = scanner.nextInt();

			if (a > 0) pos++;
			else if (a < 0) neg++;
			else zero++;

			System.out.print("Do you want to add more numbers? (Y/N): ");
			String val = scanner.next();
			if (!val.equalsIgnoreCase("Y")) break;
		}

		System.out.println("\nResults:");
		System.out.println("Positive Numbers Count: " + pos);
		System.out.println("Negative Numbers Count: " + neg);
		System.out.println("Zero Count: " + zero);

		scanner.close();
	}
}
