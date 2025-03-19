package motorola;

import java.util.HashMap;

public class ArrayFreqValSameOptimized {
	public static int solution(int[] A) {
		HashMap<Integer, Integer> freqMap = new HashMap<>();

		// Count frequencies
		for (int num : A) {
			freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
		}

		int maxVal = 0; // Default to 0 if no valid number is found
		for (int key : freqMap.keySet()) {
			if (key == freqMap.get(key)) { // Check if num == frequency
				maxVal = Math.max(maxVal, key);
			}
		}

		return maxVal;
	}

	public static void main(String[] args) {
		int[] a = {3, 1, 4, 1, 5};
		System.out.println(solution(a)); // Output: 1
	}
}
