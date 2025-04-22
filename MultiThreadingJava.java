package com.tns.kprit.Multithreading;

public class MultiThreadingJava extends Thread{

	public void run() {
		for(int i =1;i<5;i++) {
			System.out.println(Thread.currentThread().getName()+":"+i);
		}
	}
	
	public static void main(String[] args) {
		MultiThreadingJava t1 = new MultiThreadingJava();
		MultiThreadingJava t2 = new MultiThreadingJava();
		
		t1.start();
		t2.start();
	}
}
