package com.cg.exceptionsinjava.checkexceptionexample;

import java.util.Scanner;

public class CheckStringPalindrome {
		Scanner input = new Scanner(System.in);
		String str;
		public String enterString() {
			System.out.println("Enter the String to check if it is Palindrome or not");
			str = input.nextLine();
			return str;
		}
		public boolean checkString() {
			
			StringBuilder sb=new StringBuilder(enterString()); 
			String revStr = sb.reverse().toString();
			if(revStr.equals(str)) {
				System.out.println("Hurray!!!String is Palindrome");
				return true;
			}else {
				System.out.println("AWWWW!!!String is not Palindrome");
				return false;
			}
		}
}
