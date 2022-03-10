package com.cg.java8features.anonymousclsexample;

import com.cg.java8features.fninterfaceexample.Add;

public class Addition {

	public static void main(String[] args) {
		
		Add ad = new Add() {
			
			@Override
			public void add() {
				System.out.println("addition of two numbers");
				
			}
		};
		
		ad.add();

	}

}
