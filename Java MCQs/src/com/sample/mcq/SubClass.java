package com.sample.mcq;

public class SubClass extends SuperClass {
	int b;
	SubClass(int b){
		super(b);
		this.b = b;
		System.out.println(b);
	}
	
	public static void main(String[] args) {
		SubClass sb = new SubClass(45);
	}
}
