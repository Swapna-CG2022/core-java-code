package com.cg.oopsinjava.staticclassexample;

public class StaticClassDemo {

	public static void main(String[] args) {
		
		//Outer class Object
		Outer ot = new Outer();
		
		//object creation for static inner class
		Outer.Inner oin =  new Outer.Inner();
		oin.displayOutputFromInnerClass();

	}

}
