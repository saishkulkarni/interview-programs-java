package infosys;

import java.util.*;

public class BobPlays {
	public static int solve(int N, int M, List<String> words, String s) {
		HashSet<Character> charSet = new HashSet<>();
		for (char c : s.toCharArray()) {
			charSet.add(c);
		}

		HashSet<String> wordSet = new HashSet<>();
		for (String word : words) {
			for (char c : word.toCharArray()) {
				if (charSet.contains(c)) {
					wordSet.add(word);
					break; // No need to check further for this word
				}
			}
		}

		int res = wordSet.size();
		return res > 0 ? res * N : -1;
	}

	public static void main(String[] args) {
		int N = 3;
		int M = 5;
		List<String> list = Arrays.asList("hello", "world", "baby");

		System.out.println(solve(N, M, list, "wbadb")); // Output: 6
	}
}
