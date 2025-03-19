package kumaran;

public class Directions {
	public static void solution(String S) {
		int vertical = 0;
		int horizontal = 0;
		StringBuilder ver = new StringBuilder();
		StringBuilder hor = new StringBuilder();

		// Calculate net movement
		for (int i = 0; i < S.length(); i++) {
			char c = S.charAt(i);
			if (c == 'N') {
				vertical++;
			} else if (c == 'S') {
				vertical--;
			} else if (c == 'E') {
				horizontal++;
			} else if (c == 'W') {
				horizontal--;
			}
		}

		// If Alice returns to (0,0), print "Sad Alice"
		if (vertical == 0 && horizontal == 0) {
			System.out.println("Sad Alice");
			return;
		}

		// Construct the shortest path
		if (vertical > 0) {
			ver.append("N".repeat(vertical));
		} else {
			ver.append("S".repeat(-vertical));
		}

		if (horizontal > 0) {
			hor.append("E".repeat(horizontal));
		} else {
			hor.append("W".repeat(-horizontal));
		}

		System.out.println(ver.toString() + hor.toString());
	}

	public static void main(String[] args) {
		String s = "NWSSEWSNWSSNNEEWS";
		solution(s);
	}
}
