package com.cg.oopsinjava.superkeyword;

public class A {
	int var;
	int value;
	public A() {
		this(78,89); 
		System.out.println("Default constructor of A class .....");
		
	}
	public A(int var,int value) {
		//super();
		//this(); //calls same class default constructor is called
		int data;
		this.var = var;
		this.value = value;
		System.out.println("Param constructor of A class called from default constructor using this() ...."+ var);
	}
	
	protected void quote() {
		System.out.println("You can avoid reality,but you cannot avoid the consequences of avoiding reality....Ayn Rand");
	}
	
	public void message() {
		System.out.println("Calling quote() metod from here......");
		this.quote();
	}

}
