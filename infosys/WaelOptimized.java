package infosys;

import java.util.Scanner;

public class WaelOptimized {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int[] arr = new int[n];

		for (int i = 0; i < n; i++)
			arr[i] = sc.nextInt();

		int maxRes = Integer.MIN_VALUE;

		// Instead of iterating through all `i`, we find the optimal `i`
		for (int i = k; i >= 0; i--) {
			int res = 0;
			for (int num : arr) {
				res += (i ^ num);
			}
			maxRes = Math.max(res, maxRes);
		}

		System.out.println(maxRes);
		sc.close();
	}
}
