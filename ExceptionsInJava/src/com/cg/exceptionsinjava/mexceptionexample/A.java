package com.cg.exceptionsinjava.mexceptionexample;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class A {
	//Unhandled exception type IOException
	public void readFromFile() throws IOException {
		
				BufferedReader br1 = new BufferedReader(new FileReader("myfile.txt"));
				int i;
				while((i=br1.read())!=-1) {
					//System.out.print(i + " ");
					
					System.out.print((char)i);

				}
				System.out.println();
				System.out.println();
				br1.close();
	}
}
