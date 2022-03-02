package com.cg.oopsinjava.polymorphism;

import java.util.Scanner;

public class Employee {
	
	int employeeId;
	String employeeName;
	float employeeSalary;
	int employeeAge;
	
	//default constructor
	public Employee() {
		System.out.println("Employee Constructor......called...");
	}
	
	//parameterized constructor
	public Employee(int employeeId,String employeeName) {
		// TODO Auto-generated constructor stub
	}
	
	//parameterized constructor
	public Employee(float employeeSalary) {
		// TODO Auto-generated constructor stub
	}
	
	//parameterized constructor
	public Employee(int employeeId,String employeeName,float employeeSalary,int employeeAge) {
		// TODO Auto-generated constructor stub
	}
	Scanner sc = new Scanner(System.in);
	void readEmployeeDetails() {
		System.out.println("Enter the Employee details....");
	}
	
	void printEmployeeDetails() {
		System.out.println("Employee details are ....");
	}
	
	void printEmployeeDetails(String empName) {
		System.out.println("Employee details are ....");
	}
	
	void calculateSalary() {
		System.out.println("Employee Salary details are ....");
		
	}

}
