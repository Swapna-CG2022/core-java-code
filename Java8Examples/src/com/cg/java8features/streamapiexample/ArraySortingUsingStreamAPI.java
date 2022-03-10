package com.cg.java8features.streamapiexample;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ArraySortingUsingStreamAPI {

	public static void main(String[] args) {
		
		//create an int array
		int[] values = new int[] {10,9,2,1,6,5};
		Arrays.sort(values);
		Arrays.stream(values).filter(v -> (v > 5)).forEach(System.out::println);
		//
		
		//List<Integer> filteredList = Arrays.stream(values).filter(v -> (v > 5)).map(v -> v).collect(Collectors.toList());
	}

}
