package stringsexample;

import java.util.Scanner;

/**
 * @author Swapna
 *
 */
public class StringsDemo {
	
	/**
	 * @param args
	 */

	public static void main(String[] args) {
		
		
		//String quote = new String("Strings In Java");
		char[] city = {'B','a','n','g','a','l','o','r','e'};
		String myCity = new String(city);
		
		/*
		 * System.out.println(myCity.charAt(0));
		 * System.out.println(myCity.substring(5));
		 * System.out.println(myCity.substring(2,5));
		 * System.out.println(myCity.startsWith("A"));
		 * System.out.println(myCity.endsWith("e"));
		 * System.out.println(myCity.compareTo("bangalore"));
		 */
		//"Mumbai".compareTo("Andhra Pradesh"));
		
		/*
		 * String str = new String("This is a String"); String str1 =
		 * "This is a String";
		 * System.out.println(str.concat(" In Java,which is immutable"));
		 */
		
		//System.out.println(str.equals(str1));
		
		/*
		 * String str = "This is a String"; String[] words = str.split(" ");
		 * System.out.println("String divided in to words..........");
		 * System.out.println("======================================="); for(String w :
		 * words) { System.out.println(w); }
		 */
		
		String message;
		
		//System.out.println("Find index of a character");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String");
		/*next() method to read the string using scanner 
		but only it accepts sentence with out spaces */
		message = sc.nextLine(); 
		System.out.println(message);
		System.out.println("Enter the character to check the index ......");
		char index = sc.next().charAt(0);
		int charIndex = message.indexOf(index);
		System.out.println("character at index " + index + " = " +charIndex);
		//System.out.println(message.contentEquals("Hello"));
		int charIndex1 = message.lastIndexOf(index);
		System.out.println("character at index " + index + " = " +charIndex1);
		System.out.println("length of string = " + message.length());
		
		char[] charsFromString = new char[10];
		message.getChars(2, 9, charsFromString, 0);
		System.out.println(charsFromString.length);
		System.out.println("Characters extracted from String sing getChars() method ......");
		for(char ch : charsFromString) {
			System.out.println(ch);
		}
		
		System.out.println(message.isEmpty()); //" "
		System.out.println(message.isBlank());//""
		System.out.println(message.replace('i','e'));
		
		//System.out.println(message.repeat(2));
		System.out.println(message.replaceAll(" ", "-"));
		

	}

}
