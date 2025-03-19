package general;

import java.util.ArrayList;
import java.util.List;

public class VowelTogether {

	public static List<String> vowelUnique(String input) {
		List<String> vowelsFound = new ArrayList<>();
		boolean hasVowel = false;

		for (char ch : input.toCharArray()) {
			if ("aeiouAEIOU".indexOf(ch) != -1) {  // Check if char is a vowel
				if (!vowelsFound.contains(String.valueOf(ch))) {
					vowelsFound.add(String.valueOf(ch)); // Add only unique vowels
				}
				hasVowel = true;
			}
		}

		if (!hasVowel) {
			vowelsFound.add("There are no vowels in the given string");
		}

		return vowelsFound;
	}

	public static void main(String[] args) {
		String input = "fly";
		List<String> result = vowelUnique(input);

		for (String c : result) {
			System.out.println(c);
		}
	}
}
