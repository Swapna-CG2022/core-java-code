package com.cg.exceptionsinjava.mexceptionexample;

import java.io.IOException;

public class C {
	 A a = new A();
	public void  callMethod(){
		try {
			a.readFromFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
