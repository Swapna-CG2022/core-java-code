package arraysandforloopexample;

import java.util.Scanner;

public class ArrayAndForEach {

	public static void main(String[] args) {
		int[] values = new int[6];
		//store or read values in to array from keyborad
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the values of Array");
		for(int i=0;i<values.length;i++) {
			values[i] = sc.nextInt();
		}
		
		//reading the array values using for each from array to display in console
		System.out.println("values of Array .......");
		for (int arrayValue : values) {
			System.out.println(arrayValue);
		}
		

	}

}
