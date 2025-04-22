package com.tns.kprit.collection;

import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueCollections {

	public static void main(String[] args) {
		
		//LinkedList
		Queue<Integer> ll = new LinkedList<>();
		
		ll.add(1);
		ll.add(2);
		ll.add(3);
		ll.add(4);
		ll.add(5);
		
		System.out.println("Linked List: " + ll);
		
		ll.remove();//FIFO
		System.out.println("After Removing:"+ll);
		
		for(int i : ll) {
			System.out.println("Elements in list: "+i);
		}
		
		//Priority Queue
		Queue<String> s = new PriorityQueue<>();
		
		s.add("Hyderabad");
		s.add("Vizag");
		s.add("Telangana");
		s.add("Goa");
		s.add("Ladakh");
		
		System.out.println("Priority Queue: "+s);
		
		s.remove("Telangana");
		System.out.println(s);
		
		for(String st : s) {
			System.out.println("Elements: " + st);
		}
		
		//ArrayDeque
		
		Queue<Float> f = new ArrayDeque<>();
		
		f.add(1.2f);
		f.add(1.4f);
		f.add(1.0f);
		f.add(0.8f);
		f.add(1.8f);
		
		System.out.println("Array Deque: " + f);
		
		f.remove(1.8f);
		System.out.println("Elements: "+f);
		
		Iterator<Float> it = f.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
	}
}
