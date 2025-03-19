package general;

import java.util.ArrayList;
import java.util.List;

public class NumberLogic {

	// Factorial function for cleaner code
	private static int factorial(int num) {
		int fact = 1;
		for (int i = 1; i <= num; i++) {
			fact *= i;
		}
		return fact;
	}

	public static void main(String[] args) {
		int a = 12345;
		List<Integer> list = new ArrayList<>();

		// Extract digits and maintain correct order
		while (a > 0) {
			list.add(0, a % 10);
			a /= 10;
		}

		int sum = 0;
		System.out.println("Factorials of digits at odd indices:");
		for (int i = 0; i < list.size(); i++) {
			if (i % 2 == 0) {
				sum += list.get(i);
			} else {
				int fact = factorial(list.get(i));
				System.out.println("Factorial of " + list.get(i) + " is: " + fact);
			}
		}

		System.out.println("\nSum of digits at even indices: " + sum);
	}
}
