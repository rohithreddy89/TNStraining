package com.tns.kprit.Generics;

public class DemoGenerics2 {

	public static void main(String[] args) {
		Generics<String> s = new Generics<>();
		s.run("demo Succesfull");
		
		Generics<Integer> i = new Generics<>();
		i.run(100);
	}
}

class Generics<T>{
	@SuppressWarnings("unused")
	private T var;
	public void run(T var) {
		System.out.println("This is an demo of generics "+ var);
	}
}
