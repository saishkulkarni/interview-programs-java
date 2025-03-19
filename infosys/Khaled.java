package infosys;

import java.util.Arrays;
import java.util.Scanner;

public class Khaled {
	public static void main(String[] args) {
		final int M = 1 << 20; // 2^20 possible XOR values (large but optimized)
		int dp[] = new int[M]; // DP array to store minimum number of elements needed
		boolean res[] = new boolean[M]; // Boolean array to track visited XOR states

		Arrays.fill(dp, Integer.MAX_VALUE); // Initialize all DP values to MAX
		dp[0] = 0; // Base case: XOR sum 0 requires 0 elements

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];

		for (int i = 0; i < n; i++)
			arr[i] = sc.nextInt();

		for (int i = 0; i < n; ++i) {
			if (arr[i] == 0)
				continue;

			Arrays.fill(res, false); // Reset the boolean array for each element

			for (int k = 0; k < M; ++k) {
				if (res[k])
					continue;

				if (dp[k] != Integer.MAX_VALUE) { // Only update valid states
					dp[k ^ arr[i]] = Math.min(dp[k ^ arr[i]], dp[k] + 1);
					res[k ^ arr[i]] = true; // Mark as visited
				}
			}
		}

		int j = M - 1, k = n >> 1;
		while (dp[j] > k)
			--j;
		System.out.println(j);

		sc.close();
	}
}
