package stringbufferexample;

public class StringBufferDemo {
	
	public static void main(String[] args) {
		
		StringBuffer sb = new StringBuffer();
		System.out.println("String buffer value of empty object = " + sb);
		System.out.println("Hashcode for sb = " + sb.hashCode());
		String s = "This is a String";
		StringBuffer sb1 = new StringBuffer(s);
		System.out.println("Hashcode for sb1 before append method = " + sb1.hashCode());
		System.out.println("String buffer value of String object = " + sb1);
		sb1.append(" converted into String Buffer");
		System.out.println("String buffer value after append = " +sb1);
		System.out.println("Hashcode for sb1 after append method = " + sb1.hashCode());
		
		//Returns a hash code for this string. The hash code for a String object is computed as 

		// s[0]*31^(n-1) + s[1]*31^(n-2) + ... + s[n-1]

		//changing the string
		String s1 = "This is a String";
		System.out.println("Hashcode for s (string) = " + s1.hashCode());
		s1 = "This is a String in java";
		System.out.println
		("Hashcode for s (string) after changing the string value = " + s1.hashCode());
		
	}

}