package mathematicaloperations;

public class IncrementOperators {

	public static void main(String[] args) {
		
		int a = 5;
		int b = 6;
		int value = ++(a) + ++(b);// + a-- + ++b;

		//(a + b)++ ++
		//(a + b)-- ++;
		System.out.println(value);
		//System.out.println(a++ + b++);
		System.out.println(--a + ++b);

	}

}
