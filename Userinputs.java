package com.tns.kprit.userinputs;

import java.util.Scanner;

public class Userinputs {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		
		String s = sc.nextLine();
		
		float f = sc.nextFloat();
		
		double d = sc.nextDouble();
		
		byte b = sc.nextByte();
		
		System.out.println(a+s+f+d+b);
		
		
		sc.close();
	}
}
