package infosys;

import java.util.Arrays;

public class LongestIncreasingSubsequence {
	public static int LIS(int[] arr) {
		int n = arr.length;
		int[] dp = new int[n]; // dp[i] stores the LIS ending at index i
		Arrays.fill(dp, 1); // Every element is at least an LIS of length 1

		int maxLIS = 1;
		for (int i = 1; i < n; i++) {
			for (int j = 0; j < i; j++) {
				if (arr[i] > arr[j]) { // Increasing sequence condition
					dp[i] = Math.max(dp[i], dp[j] + 1);
				}
			}
			maxLIS = Math.max(maxLIS, dp[i]); // Track the maximum LIS
		}

		return maxLIS;
	}

	public static void main(String[] args) {
		int[] arr = {15, 6, 5, 12, 1};
		System.out.println("The length of the LIS is " + LIS(arr));
	}
}
