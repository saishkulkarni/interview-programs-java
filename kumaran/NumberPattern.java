package kumaran;

public class NumberPattern {
	public static void main(String[] args) {
		int n = 8;

		// Upper half (increasing)
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(i);
				if (j < i) {  // Ensures '*' does not print after the last number
					System.out.print(" * ");
				}
			}
			System.out.println();
		}

		// Lower half (decreasing) - Avoid duplicate middle row
		for (int i = n - 1; i > 0; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print(i);
				if (j < i) {  // Ensures '*' does not print after the last number
					System.out.print(" * ");
				}
			}
			System.out.println();
		}
	}
}
