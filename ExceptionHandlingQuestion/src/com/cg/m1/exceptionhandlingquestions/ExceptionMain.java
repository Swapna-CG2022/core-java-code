package com.cg.m1.exceptionhandlingquestions;

public class ExceptionMain {

	public static void main(String[] args) {
		ExceptionImplementation ei = new ExceptionImplementation();
		double result = ei.compute(1000, 12, '*');
		System.out.println(result);
	}

}
