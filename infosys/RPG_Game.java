package infosys;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

class Monster {
	int power;
	int bonus;

	public Monster(int power, int bonus) {
		this.power = power;
		this.bonus = bonus;
	}
}

public class RPG_Game {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt(); // Number of monsters
		int exp = sc.nextInt(); // Initial experience

		int[] monsterPower = new int[n];
		int[] bonusPoints = new int[n];

		for (int i = 0; i < n; i++) {
			monsterPower[i] = sc.nextInt();
		}
		for (int i = 0; i < n; i++) {
			bonusPoints[i] = sc.nextInt();
		}

		Monster[] monsters = new Monster[n];

		for (int i = 0; i < n; i++) {
			monsters[i] = new Monster(monsterPower[i], bonusPoints[i]);
		}

		// Sort monsters by power in ascending order
		Arrays.sort(monsters, Comparator.comparingInt(m -> m.power));

		int defeatedMonsters = 0;

		for (Monster m : monsters) {
			if (exp < m.power) {
				break; // Stop if the monster's power is greater than current experience
			}
			exp += m.bonus; // Gain experience
			defeatedMonsters++; // Increase count of defeated monsters
		}

		System.out.println(defeatedMonsters);
		sc.close();
	}
}
