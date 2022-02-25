package com.cg.oopsinjava;

import java.text.ParseException;

public class StudentMain {

	public static void main(String[] args) throws ParseException {
		
		//following statement creates an object
//		Student st = new Student();
//		st.readStudentDetails();
//		st.displayStudentDetails();
		
		/*
		 * Student st1 = new Student(); st1.readStudentDetails();
		 * st1.displayStudentDetails();
		 */
		
		//Array of Student Objects
		Student[] listOfStudents = new Student[2];
		Student student;
		
		//creating and adding student objects in the above array
		for(int i=0;i<listOfStudents.length;i++) {
			student = new Student();
			student.readStudentDetails();
			listOfStudents[i] = student;
		}
		
		for(int i=0;i<listOfStudents.length;i++) {
			listOfStudents[i].displayStudentDetails();
		}
		
		
		
	}

}
