package com.cg.oopsinjava.staticclassexample;

public class Outer {
	
	private static int i = 30;
	public void displayOutput() {
		System.out.println("Output from outer class....");
	}
	
	public static class Inner{
		public static void displayOutputFromInnerClass() {
			final int i = 30;
			System.out.println("i is a Private Variable of Outer Class ="+i);
			System.out.println("Output From Inner Class....");
		}
	}

}
