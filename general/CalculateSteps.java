package general;

/**
 * This program calculates the minimum number of steps required to reach a given distance.
 *
 * Problem Statement:
 * Given a total length and a target distance to reach, the movement follows a specific pattern:
 * - The first step moves by 1 unit.
 * - The next step moves by the sum of the previous position and the last step taken.
 * - This continues until the required distance is reached or exceeded.
 *
 * Approach:
 * 1. Start from position `0` with step size `1`.
 * 2. In each iteration, update the position using the previous step size.
 * 3. Keep track of the number of steps taken.
 * 4. Stop when the position reaches or exceeds the target distance.
 *
 * Example:
 * Input: total_length = 4, distance_to_reach = 2
 * Steps: 1 → (0 + 1), then 1 → (1 + 1) = 2
 * Output: 2 (since 2 steps are needed to reach 2)
 */

public class CalculateSteps {

	/**
	 * Computes the number of steps required to reach the given distance.
	 *
	 * @param total_length      The total possible length (not used in the logic).
	 * @param distance_to_reach The target distance to reach.
	 * @return The number of steps taken to reach or exceed the target distance.
	 */
	static int calculate_steps(int total_length, int distance_to_reach) {
		int steps = 0;
		int pos = 0;
		int i = 1;

		while (i < distance_to_reach) {
			int j = pos + i; // Update position
			pos = i; // Store previous step
			i = j; // Update step size
			steps++; // Increment step count
		}

		return steps;
	}

	public static void main(String[] args) {
		int total_length = 4;
		int distance_to_reach = 2;
		System.out.println("Steps required: " + calculate_steps(total_length, distance_to_reach));
	}
}
