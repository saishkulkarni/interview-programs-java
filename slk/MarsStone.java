package slk;

import java.util.HashSet;

public class MarsStone {
	public static int maxUniqueStone(int input1, int input2, int[] input3) {
		HashSet<Integer> restrictedSet = new HashSet<>();
		for (int stone : input3) {
			restrictedSet.add(stone);
		}

		int sum = 0, count = 0;
		for (int i = 1; i <= input1; i++) {
			if (!restrictedSet.contains(i) && sum + i <= input1) {
				sum += i;
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		int i1 = 14;
		int i2 = 4;
		int i3[] = {4, 6, 8, 9};
		System.out.print(maxUniqueStone(i1, i2, i3));  // Expected Output: Maximum number of unique stones
	}
}
