package mathematicaloperations;

public class Division {
	
	public  static void main (String...args) {
		float valueOne = 10;
		float valueTwo = 20;
		valueOne /= valueTwo;		
		System.out.println("division = " + (valueOne));
		System.out.println("addition = " +(valueOne += valueTwo));
		System.out.println("suubstraction = " +(valueOne -= valueTwo));
	}
}
