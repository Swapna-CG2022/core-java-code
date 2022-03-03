package com.cg.oopsinjava.interfaceexample;

public class Comparision extends Calculator{

	@Override
	public void findBiggest() {
		System.out.println("Biggest = " + Math.max(a, b));
		
	}

	@Override
	public void calculateSin() {
		System.out.println("sin value of a = " + Math.sin(a));
		System.out.println("sin value of b = " + Math.sin(b));
	}

	@Override
	public void calculateTan() {
		System.out.println("sin value of a = " + Math.cos(a));
		System.out.println("sin value of b = " + Math.cos(b));
		
	}

	@Override
	public void formula() {
		System.out.println("algebra = " + Math.pow(a,2) + Math.pow(b,2)+ (2 * (a * b)));
		
	}

}
