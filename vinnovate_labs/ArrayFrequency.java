package vinnovate_labs;

import java.util.HashMap;

public class ArrayFrequency {

	public static void countFreq(int arr[], int n) {
		HashMap<Integer, Integer> map = new HashMap<>();

		// Count frequency using a single loop (O(n))
		for (int i = 0; i < n; i++) {
			map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
		}

		// Print the frequency of each element
		for (var entry : map.entrySet()) {
			System.out.println(entry.getKey() + " appears " + entry.getValue() + " times");
		}
	}

	public static void main(String[] args) {
		int arr[] = {10, 20, 20, 10, 10, 20, 5, 20};
		int n = arr.length;
		countFreq(arr, n);
	}
}
