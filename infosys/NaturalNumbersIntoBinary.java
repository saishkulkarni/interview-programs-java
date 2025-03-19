package infosys;

import java.util.Scanner;

public class NaturalNumbersIntoBinary {
	public static boolean convertBase(int m, int base) {
		int rem = m % base;
		m /= base;

		while (m > 0) {
			if (m % base != rem) return false;
			m /= base;
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int base = 2;

		while (!convertBase(m, base)) {
			base++;
		}

		System.out.println(base);
		sc.close();
	}
}
