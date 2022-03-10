package com.cg.java8features.withoutoptionalclass;

import java.util.ArrayList;
import java.util.Scanner;

public class WithOutOptionalClass {
	static ArrayList<String> groceries = null;
	public static void main(String[] args) {
		
		groceries =new ArrayList<String>();
		Scanner sc = new Scanner(System.in);
		groceries.add("Rice");
		groceries.add("Wheat");
		groceries.add("Toor Dal");
		groceries.add("Chana Dal");
		groceries.add("Urad Dal");
		System.out.println("enter the grocery name to search in arrayList.......");
		String searchGrocery = sc.nextLine();
		boolean found = false;
		for(String st:groceries) {
			if(st.equals(searchGrocery)) {
				found = true;
			}else {
				found = false;
			}
		}
		if(found) {
			System.out.println("found");// = true;
		}else {
			throw new NullPointerException("Grocery Not Found");
		}
		sc.close();
		
	}

}
