package com.cg.oopsinjava.interfacesinjava8;

public interface Shape {
	
	int breadth = 50;
	int length = 50;
	public abstract void calculateArea();
	
	public abstract void calculatePerimeter();
	
	//default method used for adding common code for all implemented classes
	public default void display() {
		System.out.println("default method from shape Interface");
	}
	
	//static method used for adding static code for implementing classes
	public static void printInformation() {
		System.out.println("static method from shape Interface");
	}
	
	public default void display1() {
		System.out.println("default method from shape Interface");
	}
	//static method used for adding static code for implementing classes
	public static void printInformation1() {
		System.out.println("static method from shape Interface");
	}
}
