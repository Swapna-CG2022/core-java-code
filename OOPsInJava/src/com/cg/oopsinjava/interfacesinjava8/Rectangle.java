package com.cg.oopsinjava.interfacesinjava8;

public class Rectangle implements Shape{


	@Override
	public void calculateArea() {
		System.out.println("area = " + (length * breadth));
		
	}

	@Override
	public void calculatePerimeter() {
		System.out.println("perimeter = " + (2*(length + breadth)));
		
	}
	
	

}
