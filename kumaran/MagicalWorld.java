package kumaran;

public class MagicalWorld {
	public static String solution(String S, String T) {
		long num1 = 1;
		long num2 = 1;

		for (int i = 0; i < S.length(); i++) {
			num1 *= (S.charAt(i) - 'A' + 1);
		}
		for (int i = 0; i < T.length(); i++) {
			num2 *= (T.charAt(i) - 'A' + 1);
		}

		return (num1 % 47 == num2 % 47) ? "CHOSEN" : "NOT CHOSEN";
	}

	public static void main(String[] args) {
		String s1 = "A";
		String s2 = "Z";
		System.out.println(solution(s1, s2));
	}
}
