package com.employee.directory.employeeDirectorySystem;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import employeeDirectory.Entity.Employee_Data;
import employeeDirectory.Utility.employeeDirectoryUtility;

public class UpdateEmployee {

	public void UpdateEmpDetails() {

		SessionFactory factory = employeeDirectoryUtility.getSessionFactory();

		Session session = factory.openSession();

		Transaction transaction = session.beginTransaction();

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter EmployeeId");
		int Employee_id = sc.nextInt();
		sc.nextLine();

		Employee_Data s1 = session.find(Employee_Data.class, Employee_id);

		System.out.println("Enter Updated Salary");
		double empSalary = sc.nextDouble();
		s1.setSalary(empSalary);

		transaction.commit();

		session.close();
	}
}
