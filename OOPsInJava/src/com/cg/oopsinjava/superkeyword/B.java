package com.cg.oopsinjava.superkeyword;

public class B extends A{

	int data;
	public B() {
		
		System.out.println("Before = " + super.value);
		System.out.println("Before = " + super.var);
		super.value = 98;
		super.var = 1998;
		this.data = 567890;
		System.out.println("After = " + super.value);
		System.out.println("After = " + super.var);
		//calling super class method
		
		//calling same class method
		this.method();
		
	}
	
	private void method() {
		super.value = 123498;
		super.var = 524211998;
		super.message();
		System.out.println("After changing value in method using super = " + super.value);
		System.out.println("After changing value in method using super = " + super.var);

	}
	
	protected void message(String msg) {
		
	}
	
	@Override
	public void quote() {
		System.out.println("You can avoid reality,but you cannot avoid the consequences of avoiding reality....Ayn Rand");
	}
	

}
