package com.cg.exceptionsinjava.mexceptionexample;

import java.io.IOException;

public class B extends A{
	public void  callMethod() {
		try {
			readFromFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
