package com.cg.exceptionsinjava.imppoints;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Division {

	static public void main(String...ar) throws Exception {
		Scanner sc = new Scanner(System.in);
		String[] str;
		System.out.println("Enter the values");
		System.out.println("Enter A Values");
		int a = sc.nextInt();
		System.out.println("Enter A Values");
		int b = sc.nextInt();
		try {
			FileReader fr = new FileReader("d.txt");
		}catch (FileNotFoundException fne) {
			// TODO: handle exception
		} catch (IOException ie) {
			// TODO: handle exception
		}catch (Exception ie) {
			// TODO: handle exception
		}finally {
			
		}
	}

}
