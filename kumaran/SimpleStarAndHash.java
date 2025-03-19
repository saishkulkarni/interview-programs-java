package kumaran;

import java.util.Scanner;

public class SimpleStarAndHash {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		scanner.close(); // Always close the scanner to prevent resource leaks

		int sc = 1, hc = n - 1;

		for (int k = 0; k < n; k++) {
			// Print stars (*)
			for (int i = 0; i < sc; i++) {
				System.out.print("*");
			}
			// Print hashes (#)
			for (int j = 0; j < hc; j++) {
				System.out.print("#");
			}
			System.out.println(); // Move to the next line

			sc++;  // Increase stars
			hc--;  // Decrease hashes
		}
	}
}
