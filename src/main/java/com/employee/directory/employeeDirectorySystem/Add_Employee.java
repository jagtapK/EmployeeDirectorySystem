package com.employee.directory.employeeDirectorySystem;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import employeeDirectory.Entity.Employee_Data;
import employeeDirectory.Utility.employeeDirectoryUtility;

public class Add_Employee {

	public void AddEmployee() {
		
		// 1.session Factory
		SessionFactory factory = employeeDirectoryUtility.getSessionFactory();

		// 2. session from session factory
		Session session = factory.openSession();

		// 3.Transaction from session
		Transaction transaction = session.beginTransaction();

		Employee_Data s = new Employee_Data();

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Employee ID: ");

		s.setId(sc.nextInt());
		sc.nextLine();

		System.out.println("enter Employee name: ");
		s.setName(sc.nextLine());

		System.out.println("Enter Employee Designation: ");
		s.setDesignation(sc.nextLine());

		System.out.println("Enter Employee Department: ");
		s.setDepartment(sc.nextLine());
		
		System.out.println("Enter Employee Salary: ");
		s.setSalary(sc.nextInt());

		// 4.save process
		session.merge(s);

		//System.out.println("Updated Successfully " + s); // 5.pass to database
		transaction.commit();
		session.close();
		
	}
}