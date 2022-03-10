package com.cg.collectionsinjava.hashmapexample;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Set;



public class CollectionsUsingInterfaces {

	public static void main(String[] args) {
		
		
		Collection<String> cObjects = new HashSet<String>();
		Collection<String> cObjects1 = new ArrayList<String>();
		Collection<String> cObjects12 = new PriorityQueue<String>();
		Set<String> setProducts = new HashSet<String>();
		List<String> lisofProd = new ArrayList<String>();
		Map<Integer,String> mapObjects = new HashMap<Integer,String>();
		
			Collection c=new ArrayList();
			c.add(10);
			c.add("abc");
			
			Collection l=new HashSet();
			l.add(20);
			l.add("abc");
			l.add(30);
			
			c.addAll(l);
			c.removeAll(l);
			
			System.out.println( c );
			
		}
}
