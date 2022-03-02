package com.cg.oopsinjava.finalkeyword;

public class Shape {
	
	float length,breadth;
	final float PI;// = 3.14f; //final variable which is constant
	
	public Shape() {
		PI = 3.14f;
		System.out.println("Default Constructor");
	}

	public Shape(float length, float breadth) {
		super();
		this.PI = 3.14f;
		this.length = length;
		this.breadth = breadth;
	}
	
	public void area() {
		System.out.println("area of the shape");
	}
	
	public void perimeter() {
		System.out.println("perimeter of the shape");
	}
}
