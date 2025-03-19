package ninestars;

public class FactorialReturnString {

	public static String factorial(int input1) {
		long fact = 1; // Use long to prevent overflow for values up to 20
		for (int i = input1; i >= 1; i--) {
			fact *= i;
		}
		return String.valueOf(fact);
	}

	public static void main(String[] args) {
		int input1 = 5;
		System.out.println(factorial(input1)); // Output: "120"
	}
}
