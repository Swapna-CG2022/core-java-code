package com.cg.collectionsinjava.arraylistcrudexample;

public class MobileNumberNotValidException extends Exception {
	String mobExMsg;

	public MobileNumberNotValidException(String mobExMsg) {
		super(mobExMsg);
		this.mobExMsg = mobExMsg;
	}
	
	
}
