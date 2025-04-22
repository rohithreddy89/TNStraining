package com.tns.kprit.collection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetCollections {

	public static void main(String[] args) {
		
		
		//HashSet
		HashSet<String> hs = new HashSet<>();
		
		hs.add("Red");
		hs.add("blue");
		hs.add("black");
		hs.add("violet");
		hs.add("bike");
		hs.add("White");
		
		System.out.println("HashSet: "+hs);
		
		hs.remove("bike");
		
		System.out.println("Elements after Removing : "+ hs);
		
		for(String n : hs) {
			System.out.println("Each element in the HashSet: "+ n);
		}
		
		//LinkedHashSet
		
		LinkedHashSet<Integer> lh = new LinkedHashSet<>();
		
		lh.add(10);
		lh.add(30);
		lh.add(50);
		lh.add(20);
		lh.add(40);
		
		System.out.println("Elements in the LinkedHashSet"+ lh);
		
		lh.remove(50);
		
		System.out.println("Elements after removing: "+ lh);
		
		for(int i : lh) {
			System.out.println("Elements in the Linked Hash Set : " + i);
		}
		
		//TreeSet
		
		TreeSet<String> ts = new TreeSet<>();
		
		ts.add("telangana");
		ts.add("Kerala");
		ts.add("Goa");
		ts.add("Delhi");
		ts.add("Bangalore");
		
		System.out.println("Tree Set: "+ ts);
		
		ts.remove("Goa");
		
		System.out.println("Elements after removing : "+ ts);
		
		for(String s:ts) {
			System.out.println("Each element in the Tree Set: "+s);
		}
	}
}
