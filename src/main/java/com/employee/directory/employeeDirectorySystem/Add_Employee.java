package com.employee.directory.employeeDirectorySystem;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import employeeDirectory.Entity.EmpDetails;
import employeeDirectory.Entity.Employee_Data;
import employeeDirectory.Utility.employeeDirectoryUtility;

public class Add_Employee {

	public static void main(String[] args) {
		SessionFactory factory = employeeDirectoryUtility.getSessionFactory();
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		
		EmpDetails det = new EmpDetails();
		det.setAadhar("4567");
		det.setPanno("pragati6253");
		
		Employee_Data data = new Employee_Data();
		data.setName("pragati");
		data.setDepartment("IT");
		data.setDesignation("Developer");
		data.setSalary(300000);
		data.setEmpdetails(det);
		
		session.persist(data);
		
		transaction.commit();
		session.close();
	}
}
//		public void AddEmployee() {
//		//1.session Factory
//    	SessionFactory factory = employeeDirectoryUtility.getSessionFactory();
//      
//        //2. session from session factory
//    	Session session = factory.openSession();
//        
//        //3.Transaction from session
//    	Transaction transaction = session.beginTransaction();
//    	
//		
//		Employee_Data s = new Employee_Data();
//		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter Employee ID: ");
//		
//		s.setId(sc.nextInt());
//		sc.nextLine();
//		
//		System.out.println("enter Employee name: ");
//		s.setName(sc.nextLine());
//		
//		System.out.println("Enter Employee Designation: ");
//		s.setDesignation(sc.nextLine());
//		
//		System.out.println("Enter Employee Department: ");
//		s.setDepartment(sc.nextLine());
//		
//		System.out.println("Enter Employee Salary: ");
//		s.setSalary(sc.nextInt());
//		
//		
//		//4.save process
//    	session.persist(s);
//    	
//    	System.out.println("Updated Successfully " + s);
//    	//5.pass to database
//    	transaction.commit();

