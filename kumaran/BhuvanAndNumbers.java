package kumaran;

import java.util.Scanner;

public class BhuvanAndNumbers {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String num1 = sc.next();
		String num2 = sc.next();

		// Replace '5' with '6' for max and '6' with '5' for min
		String num1Max = num1.replace('5', '6');
		String num2Max = num2.replace('5', '6');
		String num1Min = num1.replace('6', '5');
		String num2Min = num2.replace('6', '5');

		// Use Long.parseLong to handle large numbers
		long maxSum = Long.parseLong(num1Max) + Long.parseLong(num2Max);
		long minSum = Long.parseLong(num1Min) + Long.parseLong(num2Min);

		System.out.println(minSum + " " + maxSum);
		sc.close();
	}
}
