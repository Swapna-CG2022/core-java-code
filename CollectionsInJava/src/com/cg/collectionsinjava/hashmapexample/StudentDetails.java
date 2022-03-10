package com.cg.collectionsinjava.hashmapexample;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;
import java.util.TreeSet;

public class StudentDetails {
	
	public static void main(String[] args) {
		HashMap<String,Float> stdDetails = new HashMap<String,Float>();
		
		stdDetails.put("Rama",50.0f);
		stdDetails.put("Raja",60.0f);
		stdDetails.put("Rani",70.0f);
		stdDetails.put("Ravi",80.0f);
		
		Collection<Float> std_Marks = stdDetails.values();
		float sum = 0.0f;
		
		for(Float marks : std_Marks) {
			sum = sum + marks;
		}
		
		float std_avg = sum/std_Marks.size();
		System.out.println("Averagge of students in HashMap = " + std_avg);
		
		TreeSet<Float> sorted_stdMarks = new TreeSet<Float>();
		sorted_stdMarks.addAll(std_Marks);
		
		System.out.println("Maximum marks  of students in HashMap = " + sorted_stdMarks.last());

		
		Set<String> student_Names = stdDetails.keySet();
		
		TreeSet<String> sorted_stdNames = new TreeSet<String>();
		sorted_stdNames.addAll(student_Names);
		System.out.println("Names Sorted using TreeSet.....");
		for(String std_name : sorted_stdNames) {
			System.out.println(std_name);
		}
	}

}
