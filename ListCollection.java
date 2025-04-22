package com.tns.kprit.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Stack;
import java.util.Vector;

public class ListCollection {

	public static void main(String[] args) {
		
		
		//ArrayList
		ArrayList<String> ar = new ArrayList<>();
		
		ar.add("Gt650");
		ar.add("Intraceptor");
		ar.add("Classic");
		ar.add("Meteor");
		
		System.out.println("Arraylist "+ ar);
		ar.remove(3);
		
		System.out.println("After Removing "+ ar);
		
		for(String n:ar) {
			System.out.println("Elemnts in arraylist are: "+ n);
		}
		
		//LinkedList
		
		LinkedList<String> ll = new LinkedList<>();
		
		ll.add("America");
		ll.add("New Zeland");
		ll.add("Australia");
		
		System.out.println("Country Names: "+ ll);
		
		ll.remove(0);
		ll.addFirst("USA");
		ll.addLast("Europe");
		
		System.out.println("Some Other Countries: "+ll);
		
		Iterator<String> it = ll.iterator(); 
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		//Vector
		
		Vector<Integer> v = new Vector<>();
		
		v.add(10);
		v.add(20);
		v.add(30);
		v.add(40);
		v.add(50);
		
		System.out.println(v);
		
		v.remove(4);
		
		System.out.println("Elements after removing: "+ v);
		
		for(int n : v) {
			System.out.println("Each Element in the vector: "+ n);
		}
		
		//Stack
		
		Stack<String> st = new Stack<>();
		
		st.push("Biryani");
		st.push("khadhu ka kheer");
		st.push("Apollo Fish");
		st.push("Chicken 65");
		st.push("Water Melon");
		
		System.out.println("Stack Elements"+ st);
		
		st.pop();
		
		System.out.println("Elements after popping"+st);
		
		for(String s : st) {
			System.out.println("Each Item in the stack: "+s);
		}
	}
}
