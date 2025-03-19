package general;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Pairs {

	public static int findNumberOfPairs(List<Integer> a, List<Integer> b) {
		Collections.sort(a); // Sort both lists
		Collections.sort(b);

		int i = 0, j = 0, count = 0;

		// Two-pointer technique
		while (i < a.size() && j < b.size()) {
			if (a.get(i) > b.get(j)) {
				count += (a.size() - i); // All remaining elements in `a` are greater
				j++; // Move `b` pointer
			} else {
				i++; // Move `a` pointer
			}
		}
		return count;
	}

	public static void main(String[] args) {
		List<Integer> a = new ArrayList<>(List.of(3, 1, 2, 3));
		List<Integer> b = new ArrayList<>(List.of(3, 1, 1, 1));

		System.out.println(findNumberOfPairs(a, b)); // Output: 5
	}
}
