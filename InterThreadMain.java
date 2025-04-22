package com.tns.kprit.Synchronisation;

public class InterThreadMain {

	public static void main(String[] args) {
        InterThreadCommunicationMethod b = new InterThreadCommunicationMethod();

        new Thread(() -> {
            try {
                for (int i = 1; i <= 5; i++) b.produce(i);
            } catch (Exception e) {}
        }).start();

        new Thread(() -> {
            try {
                for (int i = 1; i <= 5; i++) b.consume();
            } catch (Exception e) {}
        }).start();
    }
}
