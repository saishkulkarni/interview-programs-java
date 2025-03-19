package general;

import java.util.LinkedHashSet;

public class RemoveDuplicate {
	public static void main(String[] args) {
		int[] a = {1, 2, 3, 3, 4};

		// Use LinkedHashSet to maintain insertion order
		LinkedHashSet<Integer> uniqueNumbers = new LinkedHashSet<>();
		for (int num : a) {
			uniqueNumbers.add(num);
		}

		// Convert Set to an array
		int[] b = new int[uniqueNumbers.size()];
		int index = 0;
		for (int num : uniqueNumbers) {
			b[index++] = num;
		}

		// Print the result
		for (int num : b) {
			System.out.print(num + " ");
		}
	}
}
