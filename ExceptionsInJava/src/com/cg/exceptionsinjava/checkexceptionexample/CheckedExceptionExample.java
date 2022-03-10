package com.cg.exceptionsinjava.checkexceptionexample;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CheckedExceptionExample {

	public static void main(String[] args) throws IOException {
		writeInToFile();
		
		System.out.println("Reading contents from the file......");
		readFromFile();
		
		readFromFile1();
	}
	
	public static void writeInToFile() throws IOException {
		//Unhandled exception type IOException
				BufferedWriter bw = new BufferedWriter(new FileWriter("myfile.txt"));
				bw.write("Welcome");
				bw.close();
	}
	
	public static void readFromFile() throws IOException {
		//Unhandled exception type IOException
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
	static BufferedReader br = null;
	public static void readFromFile1()  {
		//Unhandling exception type IOException
		try {
				br= new BufferedReader(new FileReader(".project"));
				int j;
				while((j=br.read())!=-1) {
					//System.out.print(i + " ");
					
					System.out.print((char)j);

				}
				System.out.println();
				System.out.println();
				
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				br.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally {
				System.out.println("Finally block from finally........");
			}
		}
	}
}
