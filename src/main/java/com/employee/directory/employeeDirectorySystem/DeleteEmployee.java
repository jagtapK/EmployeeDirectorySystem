package com.employee.directory.employeeDirectorySystem;

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
		
		Employee_Data st = session.find(Employee_Data.class, 301);
		session.remove(st);
		
		transaction.commit();
		session.close();

	}

}
