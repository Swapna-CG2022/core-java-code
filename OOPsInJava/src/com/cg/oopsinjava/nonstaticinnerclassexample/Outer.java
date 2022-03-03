package com.cg.oopsinjava.nonstaticinnerclassexample;

public class Outer {
	private  int i = 30;
	public void displayOutput() {
		System.out.println("Output from outer class....");
	}
	private void display() {
		System.out.println("Output from outer class....");
	}
	class Inner{
		public void displayOutputFromInnerClass() {
			display();
			System.out.println("i is a Private Variable of Outer Class ="+i);
			System.out.println("Output From Inner Class....");
		}
	}
}
