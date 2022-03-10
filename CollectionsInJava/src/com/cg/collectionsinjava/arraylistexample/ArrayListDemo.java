package com.cg.collectionsinjava.arraylistexample;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ArrayListDemo {

	public static void main(String[] args) {
		
	
		
		ArrayList<String> arr1 = new ArrayList<String>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of ArrayList....");
		int n = sc.nextInt();
		System.out.println("Enter the values to insert in to ArrayList.....");
		for(int i =0 ;i< n ;i++) {
			arr1.add(sc.next());
		}
		for (String string1 : arr1) {
			System.out.println(string1);
		}
		System.out.println("ArrayList data after sorting");
		Collections.sort(arr1);
		System.out.println(arr1);
		for (String string1 : arr1) {
			System.out.println(string1);
		}
	}

}
