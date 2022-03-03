package com.cg.oopsinjava.abstractclsexample;

import java.util.Scanner;

public abstract class Shape {
	
	public Shape() {
		System.out.println("Constructor of Shape Class(Abstract Class)");
	}
	public int length;
	public int breadth;
	
	
	public Shape(int length, int breadth, Scanner sc) {
		super();
		this.length = length;
		this.breadth = breadth;
		this.sc = sc;
	}
	
	
	public Shape(int length, int breadth) {
		super();
		this.length = length;
		this.breadth = breadth;
	}
	Scanner sc = new Scanner(System.in);
	
	public abstract void calculateArea();
	
	public abstract void calculatePerimeter();
	
	public void readDimensions() {
		System.out.println("Enter the Length");
		length = sc.nextInt();
		System.out.println("Enter the Breadth");
		breadth = sc.nextInt();
	}

}
