package com.cg.oopsinjava.statickeyword;

public class StaticVariableExample {

	 static int i = 0;
	
	public StaticVariableExample() {
		i++;
	}
	
	void display() {
		i++;
		System.out.println(i);
	}
	public static void main(String[] args) {
		StaticVariableExample sve1 = new StaticVariableExample();
		StaticVariableExample sve2 = new StaticVariableExample();
		StaticVariableExample sve3 = new StaticVariableExample();
		StaticVariableExample sve4 = new StaticVariableExample();
		sve1.display();
		sve2.display();
		sve3.display();
		sve4.display();
	}

}
