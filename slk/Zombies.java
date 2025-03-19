package slk;

public class Zombies {

	public static int find(int[] input1, int input2) {
		for (int i = 0; i < input2 - 1; i++) {
			if (input1[i] > input1[i + 1] && gcd(input1[i], input1[i + 1]) == 1) {
				return i;
			}
		}
		return -1;
	}

	// Optimized GCD using Euclidean Algorithm
	public static int gcd(int a, int b) {
		while (b != 0) {
			int temp = b;
			b = a % b;
			a = temp;
		}
		return a;
	}

	public static void main(String[] args) {
		int num = 6;
		int[] array = {1, 1, 3, 6, 7, 3};
		System.out.println(find(array, num));
	}
}
