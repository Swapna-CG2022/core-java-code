package com.cg.oopsinjava.interfaceexample;

public abstract class Calculator implements ArithmeticOperations,GeometricalOperations,AlgebraFormula{

	@Override
	public void add() {
		System.out.println(a + b);
		
	}

	@Override
	public void sub() {
		System.out.println(a - b);
		
	}

	@Override
	public void mul() {
		System.out.println(a * b);
		
	}

	@Override
	public void div() {
		System.out.println(a / b);
		
	}

	@Override
	public void mod() {
		System.out.println(a % b);
		
	}

}
