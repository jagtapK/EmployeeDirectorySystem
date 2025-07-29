package com.employee.directory.employeeDirectorySystem;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import employeeDirectory.Entity.Employee_Data;
import employeeDirectory.Utility.employeeDirectoryUtility;

public class SearchByName {

	public void SearchName() {

		// 1/session factory
		SessionFactory factory = employeeDirectoryUtility.getSessionFactory();

		// 2.session from session factory
		Session session = factory.openSession();

		// 3.Transaction from session
		Transaction transaction = session.beginTransaction();

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Employee ID to Search : ");
		int Id = sc.nextInt();
		sc.nextLine();

		// 4.write your logic here
		Employee_Data ed = session.find(Employee_Data.class, Id);
		System.out.println(ed.toString());

		// 5.pass to database
		transaction.commit();

		// 6.session close
		session.close();

	}

}
