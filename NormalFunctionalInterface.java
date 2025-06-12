package com.tns.kprit.LamdaExpression;


interface Function{
	void method(int a, int b);
}
public class NormalFunctionalInterface {

	public static void main(String[] args) {
		
		Function fun = (a, b) -> System.out.println("Multiplication of Numbers " + a*b);
		fun.method(4, 8);
	}
}
