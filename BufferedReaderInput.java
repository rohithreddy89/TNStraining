package com.tns.kprit.userinputs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReaderInput {

	public static void main(String[] args) throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter Your Name: ");
		
		String name = bf.readLine();
		
		System.out.println("hello "+ name );
	}
}
