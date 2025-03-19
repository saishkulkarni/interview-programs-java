package general;

import java.io.FileInputStream;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 * This program selects goodies for distribution among employees
 * such that the difference between the highest and lowest priced goodie
 * in the selected subset is minimized.
 */

class Item {
	String name;
	int price;

	// Constructor to initialize the Item object
	public Item(String name, int price) {
		this.name = name;
		this.price = price;
	}

	// Overriding toString() for better display format
	public String toString() {
		return this.name + ": " + this.price;
	}
}

public class HighPeak {
	public static void main(String[] args) throws Exception {
		// File path for reading input
		String inputFilePath = "D://Eclipse_Wokspaces/Class Workspace/interview_programs/src/high_peak/input.txt";
		String outputFilePath = "output.txt";

		// Reading input from the file
		FileInputStream fis = new FileInputStream(inputFilePath);
		Scanner sc = new Scanner(fis);

		// Extract number of employees
		int numberOfEmployees = Integer.parseInt(sc.nextLine().split(": ")[1]);

		// Skipping unnecessary lines in the file
		sc.nextLine();
		sc.nextLine();
		sc.nextLine();

		// Storing goodies in an ArrayList
		ArrayList<Item> goodiesList = new ArrayList<>();

		// Reading goodies and their prices
		while (sc.hasNextLine()) {
			String[] current = sc.nextLine().split(": ");
			goodiesList.add(new Item(current[0], Integer.parseInt(current[1])));
		}
		sc.close();

		// Sorting goodies based on price in ascending order
		Collections.sort(goodiesList, Comparator.comparingInt(item -> item.price));

		// Finding the minimum difference between highest and lowest priced goodie
		int minDifference = Integer.MAX_VALUE;
		int minIndex = 0;

		for (int i = 0; i <= goodiesList.size() - numberOfEmployees; i++) {
			int diff = goodiesList.get(i + numberOfEmployees - 1).price - goodiesList.get(i).price;

			// If current difference is smaller, update minDifference and minIndex
			if (diff < minDifference) {
				minDifference = diff;
				minIndex = i;
			}
		}

		// Writing the output to a file
		FileWriter fw = new FileWriter(outputFilePath);
		fw.write("The goodies selected for distribution are:\n\n");

		for (int i = minIndex; i < minIndex + numberOfEmployees; i++) {
			fw.write(goodiesList.get(i).toString() + "\n");
		}

		fw.write("\nAnd the difference between the chosen goodie with highest price and the lowest price is " + minDifference);
		fw.close();

		// Display completion message
		System.out.println("Goodies selection completed. Check output.txt for results.");
	}
}
