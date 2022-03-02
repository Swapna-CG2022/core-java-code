package com.cg.oopsinjava.finalkeyword;

public  class Rectangle extends Shape{

	public Rectangle() {
		super(5, 6);
	}
	
	@Override
	public final void area() {
		System.out.println("area of the rectangle = " + (length * breadth));
	}
	
	@Override
	public final void perimeter() {
		System.out.println("perimeter of the rectangle");
	}
}
