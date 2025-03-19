package infosys;

import java.util.ArrayList;
import java.util.List;

public class GoodNumber {
	public static int solve(int N, List<Integer> A) {
		int count = 0;
		boolean allPrimes = true;

		for (int a : A) {
			if (!checkPrime(a)) {
				allPrimes = false;
				break;
			}
		}

		if (allPrimes) {
			return 0;
		}

		int max = A.get(0);
		for (int num : A) {
			if (num > max) {
				max = num;
			}
		}

		boolean divisible = false;
		for (int num : A) {
			if (num != max && max % num == 0) {
				divisible = true;
				break;
			}
		}

		return divisible ? A.size() / 2 : A.size();
	}

	public static boolean checkPrime(int N) {
		if (N < 2) return false;
		for (int i = 2; i * i <= N; i++) {
			if (N % i == 0) return false;
		}
		return true;
	}

	public static void main(String[] args) {
		int N = 4;
		List<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(15);
		list.add(30);
		list.add(6);

		System.out.println(solve(N, list)); // Output: 2
	}
}
