package infosys;

import java.util.HashMap;
import java.util.Scanner;

public class InterestingString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		System.out.print(getMinimumFrequency(s));
		sc.close();
	}

	static int getMinimumFrequency(String s) {
		HashMap<Character, Integer> frequencyMap = new HashMap<>();

		// Build frequency map
		for (char c : s.toCharArray()) {
			frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
		}

		// Find minimum frequency
		int minFrequency = Integer.MAX_VALUE;
		for (int freq : frequencyMap.values()) {
			minFrequency = Math.min(minFrequency, freq);
		}

		return minFrequency;
	}
}
