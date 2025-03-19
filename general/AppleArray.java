package general;

import java.util.Arrays;

/**
 * This program calculates the sum of an array after applying a coupon discount.
 *
 * Problem Statement:
 * Given an array of apple prices, we can use a coupon to get one apple for free.
 * The coupon allows us to get the cheapest apple among the first 'm' apples for free.
 * The function returns the total cost after applying this discount.
 *
 * Approach:
 * 1. Sort the array in ascending order.
 * 2. Skip the cheapest apple among the first 'm' apples (i.e., the m-th smallest element).
 * 3. If the m-th and (m-1)-th apples are the same price, skip one occurrence of it.
 * 4. Compute the total cost of the remaining apples.
 *
 * Example:
 * Input: arr = {5, 2, 4, 1, 3}, n = 5, m = 3
 * Sorted array: {1, 2, 3, 4, 5}
 * Coupon applied on 3rd smallest element (3), so the sum is 1+2+4+5 = 12.
 */

public class AppleArray {

	/**
	 * Computes the sum of apple prices after applying the coupon.
	 *
	 * @param n   The number of apples.
	 * @param m   The number of apples from which one is free.
	 * @param arr The array containing apple prices.
	 * @return    The total price after applying the coupon.
	 */
	public static long appleAndCoupon(int n, int m, int[] arr) {
		long sum = 0;
		Arrays.sort(arr); // Sort the array in ascending order

		for (int i = 0; i < n; i++) {
			// Skip the m-th smallest element (free apple)
			if (i == m - 1) {
				continue;
			}

			// Additional check to avoid removing an extra apple if the free apple is duplicated
			if (i == m - 2 && arr[m - 2] == arr[m - 1]) {
				continue;
			}

			sum += arr[i]; // Add the remaining apple prices
		}

		return sum;
	}

	public static void main(String[] args) {
		int[] arr = {5, 2, 4, 1, 3};
		System.out.println("Total cost after applying the coupon: " + appleAndCoupon(5, 3, arr));
	}
}
