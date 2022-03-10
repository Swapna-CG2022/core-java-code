package com.cg.exceptionsinjava.checkexceptionexample;

public class ErrorExample {
	static String[] newStr = {"rama","ra"};
	public static void main(String[] args) {
		methodOne();
	
	}
	
	static void methodOne() {
		System.out.println("rereafafa");
		main(newStr);
	}

}
