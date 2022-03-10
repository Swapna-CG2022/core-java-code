package com.cg.collectionsinjava.hashmapexample;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeSet;

public class HashMapExample {

	public static void main(String[] args) {
		
		HashMap<Integer, String> empDetails = new HashMap<Integer, String>();
		
		HashMap<String,Float> stdDetails = new HashMap<String,Float>();
		
		empDetails.put(123, "Rama");
		empDetails.put(124, "Raheem");
		empDetails.put(129, "Raheem");
		System.out.println(empDetails);
		
		/*
		 * HashMap<String, Employee> empData = new HashMap<String, Employee>();
		 * System.out.println("After storing Employee value with a key ....." );
		 * //create employee objects to store in HashMap Employee emp1 = new
		 * Employee(123456,"Rama"); Employee emp2 = new Employee(123457,"Ramya");
		 * Employee emp3 = new Employee(123458,"Rajya"); empData.put("1jtp13", emp1);
		 * empData.put("2", emp2); empData.put("3", emp3); System.out.println(empData);
		 */
		
		//retrieving only keys using keySet()
		
		Set<Integer> empDetails_Keys =  empDetails.keySet();
		System.out.println("empDetails_Keys.........");
		for(Integer i : empDetails_Keys) {
			System.out.println(i);
		}

		HashSet<Integer> hs = new HashSet<Integer>();
		hs.addAll(empDetails_Keys);
		
		
		
		//retrieving only values using values()
		
		Collection<String> empDetails_Values =  empDetails.values();
		System.out.println("empDetails_Values.........");
		for(String i : empDetails_Values) {
			System.out.println(i);
		}
		
		TreeSet<String> ts = new TreeSet<String>();
		ts.addAll(empDetails_Values);
		
		ArrayList<String> al = new ArrayList<String>();
		al.addAll(empDetails_Values);

		//retrieving keys and values using entrySet()
		
		Collection<Entry<Integer, String>> empDetails_EntrySet =  empDetails.entrySet();
		System.out.println("empDetails_Values.........");
		for(Entry<Integer, String> i : empDetails_EntrySet) {
			System.out.println(i);
		}
		
		
		empDetails.replace(129, "Ramya");
		Collection<Entry<Integer, String>> empDetails_EntrySet1 =  empDetails.entrySet();
		System.out.println("empDetails_Values after replacing a value with new value.........");
		for(Entry<Integer, String> i : empDetails_EntrySet1) {
			System.out.println(i);
		}
		
		
		//read value  using the key
		String empName = empDetails.get(129);
		System.out.println("EmpName = " + empName + " with id = 129" );
		
		//isEmpty() => check if hashmap is empty or not
		
		//clear() => clears data from hashmap 
		
//		
//		  System.out.println(empDetails.isEmpty()); empDetails.clear();
//		  System.out.println("After clear......"); System.out.println(empDetails);
//		  System.out.println("isEmpty() After clear......");
//		  System.out.println(empDetails.isEmpty());
//		 
//		System.out.println("================================================================");
//		System.out.println(" Before remove() method ......");
//		System.out.println(empDetails);
//		System.out.println("Remove an element from Hashmap using remove() method");
//		empDetails.remove(129);
//		System.out.println(" After remove() method ......");
//		System.out.println(empDetails);
//		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
//		System.out.println(" Before remove() method ......");
//		System.out.println(empDetails);
//		System.out.println("Remove an element from Hashmap using remove() method using value and key");
//		empDetails.remove(123, "Rama");
//		System.out.println(" After remove() method ......");
//		System.out.println(empDetails);
//		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
	
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		System.out.println(empDetails);
		System.out.println(empDetails.containsKey(130));
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		System.out.println(empDetails);
		System.out.println(empDetails.containsValue("Rahim"));
	}
}
