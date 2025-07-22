package com.employee.directory.employeeDirectorySystem;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import employeeDirectory.Entity.Employee_Data;
import employeeDirectory.Utility.employeeDirectoryUtility;

public class SearchByName {
		
		public static void main(String[] args) {
		//1/session factory
		SessionFactory factory = employeeDirectoryUtility.getSessionFactory();
		
		//2. session from session factory
		Session session = factory.openSession();
		
		// 3. Transaction from session
		Transaction transaction = session.beginTransaction();
		
		// 4.write your logic here
		Employee_Data st = session.find(Employee_Data.class, 2);
		System.out.println(st.toString());
		
		 // 5.pass to database
		transaction.commit();
		
		 // 6.session close
		session.close();
		
	}

}
