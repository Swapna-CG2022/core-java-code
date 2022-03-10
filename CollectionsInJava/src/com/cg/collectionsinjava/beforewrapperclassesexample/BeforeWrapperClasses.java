package com.cg.collectionsinjava.beforewrapperclassesexample;

public class BeforeWrapperClasses {

	public static void main(String[] args) {
		
		int i = 30;
		//boxing to object
		Integer value = new Integer(i);
		//unboxing from object
		System.out.println(value.intValue());

	}

}
