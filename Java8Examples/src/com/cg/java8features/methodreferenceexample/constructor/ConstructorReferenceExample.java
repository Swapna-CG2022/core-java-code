package com.cg.java8features.methodreferenceexample.constructor;

public class ConstructorReferenceExample {
	public static void main(String[] args) {
		DataBase db = DBConnection::new;
		System.out.println(db);
		db.getDBDetails("connection to DB");
	}
}
