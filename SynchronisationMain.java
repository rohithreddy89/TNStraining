package com.tns.kprit.Synchronisation;

public class SynchronisationMain {
	    public static void main(String[] args) {
	        SynchronisationMethod t = new SynchronisationMethod();

	        Thread t1 = new Thread(); 
	        Thread t2 = new Thread(); 

	        
	        t.print(2);
	        t.print(4);
	        
	        t1.start();
	        t2.start();
	    }
	}
