package slk;

public class LastModified {
	public static int lastModified(int input1, int[] input2) {
		int index = input1;
		while (index > 0 && input2[index - 1] == 9) {
			index--;
		}
		return (index == 0) ? 1 : index;
	}

	public static void main(String[] args) {
		int[] a = {1, 3, 5, 9, 1};
		int b = 5;
		System.out.println(lastModified(b, a)); // Expected output: 5

		int[] c = {1, 3, 9, 9, 9};
		System.out.println(lastModified(5, c)); // Expected output: 3

		int[] d = {9, 9, 9, 9, 9};
		System.out.println(lastModified(5, d)); // Expected output: 1
	}
}
