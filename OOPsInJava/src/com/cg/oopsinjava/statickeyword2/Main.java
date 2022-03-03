package com.cg.oopsinjava.statickeyword2;

public class Main {

	public static void main(String[] args) {
		
	

		//How to access static variable?
		//below syntax is used to access static variable
		StaticDemo.j = 50;
		
		//How to call the static method????
		//As static methods are stored using class name following syntax is used to call static method
		StaticDemo.methodOne();
		
		StaticDemo sd = new StaticDemo();
		sd.methodTwo();//calling the non static method
	}

}
