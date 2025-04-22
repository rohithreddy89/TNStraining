package com.tns.kprit.exception;

public class EligibilityTest {
	static void checkAge(int age) throws ArithmeticException {
	if (age < 18) { 
		throw new ArithmeticException("Not eligible");
	} 
	else {
		System.out.println("Eligible to vote");
	}
	}
	
	public static void main(String[] args) {
		checkAge(16);
	}
}
