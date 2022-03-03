package com.cg.oopsinjava.statickeyword;

public class Employee {
	
	static {
		System.out.println("static block....");
	}
	
	private int employeeId;
	private String employeeName;
	private float employeeSalary;
	private static String companyName = "UNext";
	public Employee(int employeeId, String employeeName, float employeeSalary, String companyName) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeeSalary = employeeSalary;
		this.companyName = companyName;
	}
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public float getEmployeeSalary() {
		return employeeSalary;
	}
	public void setEmployeeSalary(float employeeSalary) {
		this.employeeSalary = employeeSalary;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	//if method signature contains static keyword it is static method
	public static float calculateSalary() {
		return 500000.67f;
	}
}
