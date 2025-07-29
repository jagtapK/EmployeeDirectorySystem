package com.employee.directory.employeeDirectorySystem;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import employeeDirectory.Entity.EmpDetails;
import employeeDirectory.Entity.Employee_Data;
import employeeDirectory.Utility.employeeDirectoryUtility;

public class SetDetails {

	public void details() {

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
