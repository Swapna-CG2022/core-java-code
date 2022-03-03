package com.cg.oopsinjava.statickeyword2;

public class StaticDemo {
	
	
	
	int i = 30;
	static int j = 40;
	//static Method
	public static void methodOne() {
		System.out.println("Static method called.....");
		//System.out.println("non static variable i value = " + i);
	}
	//Non Static method
	public void methodTwo() {
		System.out.println("Non Static method called.....");
		System.out.println("static variable j value = " + j);
	}
}
