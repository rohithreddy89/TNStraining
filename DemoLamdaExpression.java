package com.tns.kprit.LamdaExpression;

import java.util.Arrays;
import java.util.List;

public class DemoLamdaExpression {

	public static void main(String[] args) {
		List<String> names = Arrays.asList("Zara","Triump","Royal Enfield");
		names.sort((a,b) -> a.compareTo(b));
		names.forEach(n -> System.out.println(n));
	}
}
