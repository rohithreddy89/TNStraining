package com.tns.kprit.Multithreading;

public class ThreadPriorities extends Thread{

	 public static void main(String[] args) {
	        Thread t1 = new Thread(); 
	        Thread t2 = new Thread(); 
	        Thread t3 = new Thread(); 

	        
	        System.out.println("Thread t1 "+ Thread.currentThread().getName());
	        System.out.println("Thread t2 "+ Thread.currentThread().getName());
	        System.out.println("Thread t3 "+ Thread.currentThread().getName());
	        
	        t1.setPriority(Thread.MIN_PRIORITY);
	        t2.setPriority(Thread.NORM_PRIORITY);
	        t3.setPriority(Thread.MAX_PRIORITY);   

	        t1.start();
	        t2.start();
	        t3.start();
	    }
}
