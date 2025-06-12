package com.tns.kprit.LamdaExpression;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class PredefinedFunctionalInterface {

	public static void main(String[] args) {
		//Predicate
		Predicate<String> isEmpty = s -> s.isEmpty();
		System.out.println("Is empty: " + isEmpty.test(""));
		//Function
		Function<String, Integer> length = s -> s.length();
        System.out.println("Length of 'Java': " + length.apply("Java"));
        //Consumer
        Consumer<String> print = s -> System.out.println(s);
        print.accept("Printed");
        //Supplier
        Supplier<String> supply = () -> "Hello";
        System.out.println("Supplier: " + supply.get());

	}
}
