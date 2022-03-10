package com.cg.collectionsinjava.arraylistcrudexample;

public class StudentNotFoundException extends Exception {
	
	String exMessage;

	public StudentNotFoundException(String exMessage) {
		super(exMessage);
		this.exMessage = exMessage;
	}

}
