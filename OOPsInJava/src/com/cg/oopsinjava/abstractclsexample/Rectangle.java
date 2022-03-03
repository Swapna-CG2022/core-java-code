package com.cg.oopsinjava.abstractclsexample;

public abstract class Rectangle extends Shape{
		public Rectangle() {
			System.out.println("Rectangle Constructor");
			readDimensions();
		}

		@Override
		public void calculateArea() {
			System.out.println("area = " + (length * breadth));
			
		}

		@Override
		public void calculatePerimeter() {
			System.out.println("perimeter = " + (2*(length + breadth)));
			
		}

}
