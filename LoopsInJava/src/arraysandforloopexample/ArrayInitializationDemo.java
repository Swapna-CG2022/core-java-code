package arraysandforloopexample;

import java.util.Arrays;

public class ArrayInitializationDemo {
	
	public static void main(String[] args) {
		char[] word = {'B','Z','A','Y','W','D'};
		System.out.println("values of Array");
		for(int i=0;i<word.length;i++) {
			System.out.println(word[i]);
		}
		Arrays.sort(word);
		System.out.println("values of Array after sort");
		for(int i=0;i<word.length;i++) {
			System.out.println(word[i]);
		}
		
		System.out.println("values of Array after sort in reverse");
		for(int i=word.length-1;i>=0;i--) {
			System.out.println(word[i]);
		}
		
	}

}
