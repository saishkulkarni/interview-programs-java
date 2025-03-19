package infosys;

import java.util.Arrays;
import java.util.Scanner;

public class AndyLocation {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();  // Total number of locations
		int m = sc.nextInt();  // Number of occupied locations
		int k = sc.nextInt();  // Steps Andy can move

		int arr[] = new int[m]; // Store occupied locations
		for (int i = 0; i < m; i++) {
			arr[i] = sc.nextInt();
		}

		Arrays.sort(arr); // Sort occupied locations

		int ans = 0;

		if (k > 0) {
			// Find the maximum distance between occupied locations considering step `k`
			for (int i = k; i < m; i++) {
				ans = Math.max(ans, arr[i] - arr[i - k] - 1);
			}
		} else {
			// Find the longest continuous empty stretch
			int lastOccupied = 0;
			for (int i = 0; i < m; i++) {
				ans = Math.max(ans, arr[i] - lastOccupied - 1);
				lastOccupied = arr[i];
			}
			ans = Math.max(ans, n - lastOccupied); // Consider last gap
		}

		System.out.println(ans);
		sc.close();
	}
}
