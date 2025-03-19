package ninestars;

import java.util.HashMap;
import java.util.Map;

public class MaxOccurringCharacter {

	public static String maxElement(String input) {
		char[] c = input.toCharArray();
		HashMap<Character, Integer> map = new HashMap<>();

		// Count occurrences of each character
		for (char ch : c) {
			map.put(ch, map.getOrDefault(ch, 0) + 1);
		}

		// Print the frequency map
		System.out.println("Character Frequencies: " + map);

		// Find the character with the highest occurrence
		char maxChar = ' ';
		int maxCount = 0;

		for (Map.Entry<Character, Integer> entry : map.entrySet()) {
			if (entry.getValue() > maxCount) {
				maxChar = entry.getKey();
				maxCount = entry.getValue();
			}
		}

		return String.valueOf(maxChar); // Convert char to String for return type consistency
	}

	public static void main(String[] args) {
		String a = "abcdd";
		System.out.println("Most Frequent Character: " + maxElement(a));
	}
}
