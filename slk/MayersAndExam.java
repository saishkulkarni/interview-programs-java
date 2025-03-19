package slk;

import java.util.HashSet;

public class MayersAndExam {
	public static int mainMarks(int input1, int[] input2) {
		HashSet<Integer> seen = new HashSet<>();
		int sum = 0;

		for (int i = 0; i < input1; i++) {
			while (seen.contains(input2[i])) {
				input2[i]++; // Increment the number until it is unique
			}
			seen.add(input2[i]); // Add unique number to HashSet
			sum += input2[i]; // Update sum
		}
		return sum;
	}

	public static void main(String[] args) {
		int a = 5;
		int[] x = {1, 2, 2, 4, 5};
		System.out.println(mainMarks(a, x)); // Expected output: Unique sum
	}
}
