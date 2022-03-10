package com.cg.exceptionsinjava.uncheckedexceptionexample;

import java.util.Scanner;

public class UnCheckedExceptionExample {

	public static int[] arr = new int[3];
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		//System.out.println("Enter the Array element ");
		for(int i =0 ;i <= 3;i++) {
			arr[i] = sc.nextInt();
		}
	}

}
