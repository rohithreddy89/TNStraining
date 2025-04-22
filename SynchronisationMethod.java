package com.tns.kprit.Synchronisation;

public class SynchronisationMethod {

	synchronized void print(int n) {
        for (int i = 1; i <= 5; i++) {
            System.out.println((n * i));
        }
   
	}
}