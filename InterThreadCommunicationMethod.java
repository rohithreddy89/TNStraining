package com.tns.kprit.Synchronisation;

public class InterThreadCommunicationMethod {

	int data;
    boolean hasData = false;

    synchronized void produce(int val) throws InterruptedException {
        while (hasData) wait();
        data = val;
        System.out.println("Produced: " + val);
        hasData = true;
        notify();
    }

    synchronized void consume() throws InterruptedException {
        while (!hasData) wait();
        System.out.println("Consumed: " + data);
        hasData = false;
        notify();
    }
}
