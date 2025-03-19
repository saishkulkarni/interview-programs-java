package general;

public class LockerCircle {

	public static int maxLoot(int[] hval) {
		int n = hval.length;
		if (n == 0) return 0;
		if (n == 1) return hval[0];

		int[] dp = new int[n];
		dp[0] = hval[0];
		dp[1] = Math.max(hval[0], hval[1]);

		for (int i = 2; i < n; i++) {
			dp[i] = Math.max(hval[i] + dp[i - 2], dp[i - 1]);
		}

		return dp[n - 1];
	}

	public static void main(String[] args) {
		int hval[] = {1000, 2000, 3000, 5000, 9000, 7000, 6000, 4000, 7000, 5000};
		System.out.println("Max Loot: " + maxLoot(hval));
	}
}
