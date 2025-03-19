package general;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class HospitalPayRoll {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		List<HospitalEmployee> employeeList = new ArrayList<>();
		boolean flag = true;

		while (flag) {
			System.out.println("Enter employee details (ID,Designation,WorkingHours,OvertimeHours) separated by commas:");
			String input = scanner.nextLine();

			try {
				String[] details = input.split(",");
				if (details.length != 4) {
					throw new IllegalArgumentException("Incorrect number of inputs. Please enter 4 values.");
				}

				int id = Integer.parseInt(details[0].trim());
				String designation = details[1].trim();
				int workingHours = Integer.parseInt(details[2].trim());
				int overtimeHours = Integer.parseInt(details[3].trim());

				int salary = calculateSalary(designation, workingHours, overtimeHours);
				if (salary == -1) {
					System.out.println("Invalid designation! Please enter Doctor, Nurse, or Reception.");
					continue;
				}

				// Create and add employee to the list
				employeeList.add(new HospitalEmployee(id, designation, salary));

			} catch (NumberFormatException e) {
				System.out.println("Invalid input format. Please enter numeric values for ID, working hours, and overtime.");
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}

			// Ask user if they want to continue
			System.out.print("Do you want to continue? (Y/N): ");
			String choice = scanner.nextLine();
			if (!choice.equalsIgnoreCase("Y")) {
				flag = false;
			}
		}

		// Sorting employees by salary in descending order
		Collections.sort(employeeList);

		// Displaying employee details
		System.out.println("\n======= Payroll Summary =======");
		for (HospitalEmployee employee : employeeList) {
			System.out.println(employee);
		}
		scanner.close();
	}

	/**
	 * Calculates the salary based on designation, working hours, and overtime.
	 */
	private static int calculateSalary(String designation, int workingHours, int overtimeHours) {
		switch (designation.toLowerCase()) {
			case "doctor":
				return workingHours * 500 + overtimeHours * 1000;
			case "nurse":
				return workingHours * 150 + overtimeHours * 300;
			case "reception":
				return workingHours * 100 + overtimeHours * 200;
			default:
				return -1; // Invalid designation
		}
	}
}

class HospitalEmployee implements Comparable<HospitalEmployee> {
	private int id;
	private String designation;
	private int salary;

	public HospitalEmployee(int id, String designation, int salary) {
		this.id = id;
		this.designation = designation;
		this.salary = salary;
	}

	public int getSalary() {
		return salary;
	}

	public int getId() {
		return id;
	}

	public String getDesignation() {
		return designation;
	}

	@Override
	public int compareTo(HospitalEmployee other) {
		return Integer.compare(other.salary, this.salary); // Descending order
	}

	@Override
	public String toString() {
		return "ID: " + id + "\nDesignation: " + designation + "\nSalary: " + salary + "\n===============================";
	}
}
