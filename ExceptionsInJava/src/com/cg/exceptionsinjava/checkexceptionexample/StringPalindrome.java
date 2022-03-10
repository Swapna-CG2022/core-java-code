package com.cg.exceptionsinjava.checkexceptionexample;

public class StringPalindrome {

	public static void main(String[] args) {
		
		String str = "tomato";
		StringBuilder sb=new StringBuilder(str);  
	    sb.reverse();  
	    String rev=sb.toString();  
	    if(str.equals(rev)){  
	        System.out.println("Palidrome");
	    }else{  
	    	 System.out.println("Not Palidrome"); 
	    }  
	}  

	}


