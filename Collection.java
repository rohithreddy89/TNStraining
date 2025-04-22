package com.tns.kprit.collection;

import java.util.*;

public class Collection {
	public static void main(String[] args) {
		
	//List
	
	List<String> l = new ArrayList<>();
	
	l.add("ArrayList");
	l.add("LinkedList");
	l.add("Vector");
	l.add("Stack");
	
	System.out.println("Collection in list are: " + l);
	
	//Set
	
	Set<String> s = new HashSet<>();
	
	s.add("HashSet");
	s.add("LinkedHashSet");
	s.add("TreeSet");
	
	System.out.println("Collection in set are: "+ s);
	}
}