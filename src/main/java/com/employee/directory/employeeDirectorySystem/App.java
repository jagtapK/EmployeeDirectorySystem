package com.employee.directory.employeeDirectorySystem;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {

		System.out.println("Employee Directory System! ");

		System.out.println("Choose an option:" + "\n1. Add New Employee" + "\n2. Search by Name"
				+ "\n3. Delete Employees" + "\n4. Update Employee" + "\n5. set details" + "\n6.Exit");

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Choice");

		int choice = sc.nextInt();
		sc.nextLine();

		switch (choice) {

		case 1:
			Add_Employee ae = new Add_Employee();
			ae.AddEmployee();
			break;

		case 2:
			SearchByName an = new SearchByName();
			an.SearchName();
			break;

		case 3:
			DeleteEmployee de = new DeleteEmployee();
			de.DeleteDetails();
			break;

		case 4:
			UpdateEmployee ue = new UpdateEmployee();
			ue.UpdateEmpDetails();
			break;

		case 5:
			SetDetails sd = new SetDetails();
			sd.details();
			break;

		case 6:
			System.out.println("Exiting program. Goodbye!");
			System.exit(0); // Terminates the program immediately
			break;

		default:
			System.out.println("Enter valid Number ");
		}
		sc.close();

	}
}
