package com.cg.oopsinjava.tocheckoverridingofstaticmethod;

public class StaticMethodOverrideDemo {

	public static void main(String[] args) {
		
		A obj = new B();
		System.out.println(obj instanceof A);
		System.out.println(obj instanceof B);
		obj.add();
	}

}
