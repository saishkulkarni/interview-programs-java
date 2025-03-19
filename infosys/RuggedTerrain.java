package infosys;

import java.util.Scanner;

public class RuggedTerrain {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int[] a = new int[n];

		for (int i = 0; i < n; i++) {
			a[i] = s.nextInt();
		}

		int max_dig = 0;
		for (int i = 0; i < n - 1; i++) {
			max_dig = Math.max(max_dig, Math.abs(a[i + 1] - a[i]));
		}

		int ans = (int) Math.sqrt(max_dig);  // Using floor(sqrt(max_dig))
		System.out.println(ans);

		s.close();
	}
}
