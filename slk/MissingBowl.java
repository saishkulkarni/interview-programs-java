package slk;

public class MissingBowl {

    public static int MissingMarbles(int input1, int[] input2) {
        int sum = input2[0] + input2[input1 - 1]; // Sum of first and last elements
        int missing = 0;
        int i = 1, j = input1 - 2;

        while (i <= j) {
            if (input2[i] + input2[j] == sum) {
                i++;
                j--;
            } else {
                missing = sum - (input2[i] + input2[j]);
                break;
            }
        }

        // If no missing number is found, return 0 (indicating no missing element)
        return missing == 0 ? -1 : missing;
    }

    public static void main(String[] args) {
        int a = 5;
        int[] b = {1, 3, 5, 9, 11};
        System.out.println(MissingMarbles(a, b)); // Expected output: Missing number if found, otherwise -1
    }
}
