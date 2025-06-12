package com.tns.kprit.Generics;

public class DemoGenerics {

	public static void main(String[] args) {
		
		Box<String> g = new Box<>();
		g.set("Hello");
		g.get();
		
		Box<Integer> i = new Box<>();
		i.set(50);
		i.get();
	}
}
class Box<T> {
    private T item;

    public void set(T item) { this.item = item; }
    public void get() { System.out.println(item); }
}
