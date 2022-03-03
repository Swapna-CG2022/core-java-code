package com.cg.oopsinjava.nonstaticinnerclassexample;



public class NonStaticInnerClassExample {
		public static void main(String[] args) {
			//Outer class Object
			Outer ot = new Outer();
	
			
			//object creation for non static inner class
			Outer.Inner oin = ot.new Inner();
			oin.displayOutputFromInnerClass();

		}
}
