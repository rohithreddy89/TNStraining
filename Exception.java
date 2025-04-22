package com.tns.kprit.exception;

public class Exception {

	public static void main(String[] args) {
		
		int a = 10;
		int b = 0;
		
		try {
            int c = a/b;
            System.out.println(c);
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            System.out.println("This always executes.");
        }
		
	}
}