package slk;

import java.util.HashSet;

public class SerenaFlowers {

	public static int SheenaFlower(int input1, int input2, int[] input3) {
		HashSet<Integer> uniqueFlowers = new HashSet<>();

		// Only iterate through the first `input2` elements
		for (int i = 0; i < input2; i++) {
			uniqueFlowers.add(input3[i]);
		}

		return uniqueFlowers.size(); // Return count of unique elements
	}

	public static void main(String[] args) {
		int a = 5;  // Total flowers (not actually needed)
		int b = 3;  // Sheena picks first `b` flowers
		int[] x = {1, 1, 2, 1, 5};

		System.out.println(SheenaFlower(a, b, x)); // Expected output: 2
	}
}
