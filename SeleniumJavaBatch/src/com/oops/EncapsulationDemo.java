package com.oops;

class Employee {
	
	private String name;
	private int empID;
	private String department;
	private double salary;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getEmpID() {
		return empID;
	}
	
	public void setEmpID(int empID) {
		this.empID = empID;
	}
	
	public String getDepartment() {
		return department;
	}
	
	public void setDepartment(String department) {
		this.department = department;
	}
	
	public double getSalary() {
		return salary;
	}
	
	public void setSalary(double amount) {
		if (amount>=10000.00) {
			salary+= amount;
			System.out.println("Salary has been set as : " + salary);
		} else {
			System.out.println("Salary is not as per standards");
		}
	}

}

public class EncapsulationDemo {
	
	public static void main(String[] args) {
		Employee emp = new Employee();
		emp.setEmpID(111);
		System.out.println(emp.getEmpID());
		emp.setName("Praveen");
		System.out.println(emp.getName()); 
		emp.setSalary(10000.00);
		System.out.println(emp.getSalary());
		emp.setDepartment("QA");
		System.out.println(emp.getDepartment());
		
	}
	
}
