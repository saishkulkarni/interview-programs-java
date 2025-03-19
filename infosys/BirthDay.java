package infosys;

import java.util.Scanner;

public class BirthDay {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		System.out.println(countDivisibles(n, k));
		sc.close();
	}

	static int countDivisibles(int n, int k) {
		if (k == 1) return n;
		int count = 0;
		for (int i = 1; i <= n; i++) {
			if (i % k == 0) count++;
		}
		return count;
	}
}
