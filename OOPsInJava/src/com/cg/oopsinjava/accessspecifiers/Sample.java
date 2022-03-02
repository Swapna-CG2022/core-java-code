package com.cg.oopsinjava.accessspecifiers;

public class Sample {
	
	public Sample() {
		System.out.println("Constructor called.....");
	}
	
	int value;
	void display() {
		printMessage();
		data = 6789;
		System.out.println("display method in sample class");
	}

	private int data;
	
	private void printMessage() {
		System.out.println("The ladder of success  is best climbed "
						+ "				by stepping on the rungs of opportunity.....Ayn Rand");
	}
	
	protected int result;
	protected void thoughtOfTheDay() {
		result = 56789013; //protected data member accessed in same class
		System.out.println("Learn to value yourself,which means : "
				+ "fight for you happiness .... Ayn Rand");	
	}
}
