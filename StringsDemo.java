package com.tns.kprit.Strings;

public class StringsDemo {

	public static void main(String[] args) {
		
		//String Immutable
		String s1 = "TNSIF";
		String s2 = "tnsif";
		
		s2 = s2.toUpperCase();
		
		if(s1.equals(s2)) {
			System.out.println("Equal Strings");
		}
		else {
			System.out.println("Not Equal Strings");
		}
		
		//String Buffer
		
		StringBuffer sb = new StringBuffer();
		sb.append("Training");
		sb.append(" FSD");
		
		System.out.println(sb.charAt(5));
		
		System.out.println(sb.replace(8, 12, " Full Stack Development"));
		
		System.out.println(sb.capacity());
		
		System.out.println(sb);
		
		//String Builder
		
		StringBuilder sbb = new StringBuilder();
		
		System.out.println(sbb.capacity());
		
		System.out.println(sbb.append("TNSIF"));
		System.out.println(sbb.append(" Training Classes"));
		
		System.out.println(sbb);
		
	}
}