package infosys;

import java.util.Scanner;

public class BinaryString {
	static String str;
	static int cash, n, a, b;

	static void swapf() {
		char s[] = str.toCharArray();
		int i = 0;

		// Find first occurrence of '1'
		for (; i < s.length; i++)
			if (s[i] == '1') break;

		int j = s.length - 1;
		while (j > i) {
			if (cash < a) break; // Stop if cash is insufficient
			if (s[j] == '0') {
				if (s[i] == '0') {
					i++; // Move `i` forward if it's also '0'
				} else {
					// Perform swap
					char temp = s[i];
					s[i] = s[j];
					s[j] = temp;
					cash -= a;
					j--; // Move `j` backward
				}
			} else {
				j--; // Move `j` if not at '0'
			}
		}
		str = new String(s);
	}

	static void flipf() {
		char s[] = str.toCharArray();
		int i = 0;

		// Find first occurrence of '1'
		for (; i < s.length; i++)
			if (s[i] == '1') break;

		while (cash >= b && i < s.length) {
			if (s[i] == '1') {
				s[i] = '0';
				cash -= b;
			}
			i++;
		}
		str = new String(s);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		str = sc.next();
		cash = sc.nextInt();
		a = sc.nextInt();
		b = sc.nextInt();

		// Apply cheaper operation first
		if (a < b) {
			swapf();
			flipf();
		} else {
			flipf();
			swapf();
		}

		// Handle edge case where string is fully zero
		try {
			System.out.println(Integer.parseInt(str, 2));
		} catch (NumberFormatException e) {
			System.out.println(0);
		}

		sc.close();
	}
}
