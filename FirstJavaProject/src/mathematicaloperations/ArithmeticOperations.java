package mathematicaloperations;

import java.util.Scanner;

public class ArithmeticOperations {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Values");
		System.out.println("Enter the valueOne");
		int valueOne = sc.nextInt();
		System.out.println("Enter the valueTwo");
		float valueTwo = sc.nextFloat();
		
		//create object of addition class to call add method
		//following line of code creates an object
		Addition additionClassObject = new  Addition();
		additionClassObject.add(valueOne, valueTwo);
		
		Multiplication multiplicationClassObject = new Multiplication();
		multiplicationClassObject.mul(valueOne, valueTwo);
		
		sc.close();
		//Division divisionClassObject = new Division();
		//divisionClassObject.div(valueOne, valueTwo);
	}

}
