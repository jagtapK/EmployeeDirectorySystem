package com.employee.directory.employeeDirectorySystem;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import employeeDirectory.Entity.Employee_Data;
import employeeDirectory.Utility.employeeDirectoryUtility;

public class DeleteEmployee {
		
		public void DeleteDetails() {
		
		SessionFactory factory = employeeDirectoryUtility.getSessionFactory();
		
		Session session = factory.openSession();
		
		Transaction transaction = session.beginTransaction();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Product Id");
		int id = sc.nextInt();
		
		Employee_Data st = session.find(Employee_Data.class, id);
		
		session.remove(st);
		
		transaction.commit();
		session.close();
		System.out.println("Data deleted");

	}

}
