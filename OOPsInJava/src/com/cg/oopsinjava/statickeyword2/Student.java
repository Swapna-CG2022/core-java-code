package com.cg.oopsinjava.statickeyword2;

public class Student {
	
	private int studentId;
	private String studentName;
	private static String collegeName = "CG";
	private static float[] studentMarks = new float[10];
	public Student() {
		// TODO Auto-generated constructor stub
	}

	public Student(int studentId, String studentName) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public static String getCollegeName() {
		return collegeName;
	}

	public static void setCollegeName(String collegeName) {
		Student.collegeName = collegeName;
	}
	
	public static void calculateGradeOfStudent() {
		System.out.println("Static method because it is common for all student objects to calculate grade");
		
	
	}
	
	public void displayStudentDetails() {
		System.out.println(collegeName);
	}
	
	
}
