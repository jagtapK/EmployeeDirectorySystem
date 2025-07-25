package employeeDirectory.Entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "employee_detail")
public class Employee_Data {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;

	private String designation;
	private String Department;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "emp_id")
	private EmpDetails empdetails;

	public EmpDetails getEmpdetails() {
		return empdetails;
	}

	public void setEmpdetails(EmpDetails empdetails) {
		this.empdetails = empdetails;
	}

	private double salary;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String getDepartment() {
		return Department;
	}

	public void setDepartment(String department) {
		Department = department;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee_Data [id=" + id + ", name=" + name + ", designation=" + designation + ", Department="
				+ Department + ", empdetails=" + empdetails + ", salary=" + salary + "]";
	}

}
