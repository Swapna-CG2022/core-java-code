package com.cg.oopsinjava.interfaceexampleII;



public class Main {

	public static void main(String[] args) {
		CImpl ci = new CImpl();
		ci.display();
		
		
		//object creation for static inner class
		CImpl.Demo din =  new C.Demo();
		din.display1();
		
		SampleImpl si = new SampleImpl();
		//si.
		si.methodOne1();
	}

}
