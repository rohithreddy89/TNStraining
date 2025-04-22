package com.tns.kprit.Strings;

public class ReversingString {
	public static void main(String[] args) {
		
		String s = "Hello";
		String reversed ="";
		
		for(int i = s.length()-1; i >= 0; i--) {
			reversed += s.charAt(i);
		}
		System.out.print(reversed);
	}
}
