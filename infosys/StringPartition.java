package infosys;

import java.util.*;

public class StringPartition {

	public static int getMaxPower(int N, String S) {
		int power = 0;
		Set<String> set = new HashSet<>();

		if (isPalindrome(S)) {
			return S.length() * S.length();
		}

		// Generate all substrings and store palindromic ones
		for (int i = 0; i < S.length(); i++) {
			for (int j = i + 1; j <= S.length(); j++) {
				String sub = S.substring(i, j);
				if (isPalindrome(sub)) {
					set.add(sub);
				}
			}
		}

		// Sort palindromes by length (descending)
		List<String> words = new ArrayList<>(set);
		words.sort((a, b) -> b.length() - a.length());

		int count = 0;
		for (String word : words) {
			if (count + word.length() <= N) {
				count += word.length();
				power += word.length() * word.length();
			}
		}

		return power;
	}

	// Optimized palindrome check using two pointers
	static boolean isPalindrome(String S) {
		int left = 0, right = S.length() - 1;
		while (left < right) {
			if (S.charAt(left) != S.charAt(right)) {
				return false;
			}
			left++;
			right--;
		}
		return true;
	}

	public static void main(String[] args) {
		int N = 7;
		String S = "aabaccc";
		System.out.println(getMaxPower(N, S));
	}
}
