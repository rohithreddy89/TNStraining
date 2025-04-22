package com.tns.kprit.collection;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MAp {

	public static void main(String[] args) {
		//HashMap
		
		Map<String,Integer> m = new HashMap<>();
		m.put("Index1", 50);
		m.put("Index2", 10);
		m.put("Index3", 60);
		m.put("Index4", 20);
		m.put("Index5", 30);
		
		System.out.println("HashMap: "+ m);
		
		m.remove("Index3");
		System.out.println("After Removing: "+ m);
		
		//LinkedHashMap
		
		Map<Integer, String> ma = new LinkedHashMap<>();
		
		ma.put(1, "One");
		ma.put(2, "Two");
		ma.put(3, "Three");
		ma.put(4, "Four");
		ma.put(5, "Five");
		
		System.out.println("LinkedHashMap: "+ ma);
		
		ma.remove(3);
		System.out.println("After removing: "+ma);
		
		//TreeMAp
		
		Map<Integer, String> map = new TreeMap<>();
		
		map.put(3, "First");
		map.put(1, "Second");
		map.put(5, "Three");
		map.put(2, "Four");
		map.put(4, "Five");
		
		System.out.println("Tree Map: "+ map);
		
		map.remove(5);
		System.out.println("After Removing:"+map);
		
		//Hash table
		
		Map<String , Integer> table = new Hashtable<>();
		
		table.put("Gt650", 25);
		table.put("Classic350", 35);
		table.put("Hunter350", 40);
		
		System.out.println("Hash table: "+ table);
		
		table.remove("Classic350");
		
		System.out.println("After Removing: "+ table);
		
	}
}
