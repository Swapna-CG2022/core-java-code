package com.cg.oopsinjava.polymorphism;

public class  ContractEmployee extends Employee {
	
	public ContractEmployee() {
		System.out.println("Contract Employee Constructor......called...");

	}
	float salary;
	
	@Override //annotation => metadata => information about method to compiler
	void calculateSalary() {	
		System.out.println("ContractEmployee Salary details are ....");
	}
	
	//this method is not overriden but it is overloaded
	void printEmployeeDetails(int a) {
		System.out.println("Contract Employee details are ....");
	}
}
