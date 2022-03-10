package com.cg.exceptionsinjava.uncheckedexceptionexample;

import java.util.Scanner;

public class UnCheckedExceptionExample1 {

	static String s;// = "Hello";
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
		try {
			System.out.println("Enter the String....");
			s = sc.nextLine();
			System.out.println("Enter the index to pick a character from above string....");
			int i =  sc.nextInt();
//			if(i > s.length()-1) {
//				throw new StringIndexOutOfBoundsException("i value is greater than index of String....");
//			}else {
				System.out.println("charAt method =   " + s.charAt(8));
			//}
			
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println(e.getMessage());
		}
		
	}

}
