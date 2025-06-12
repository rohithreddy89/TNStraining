package com.tns.kprit.methodreference;

import java.util.Arrays;
import java.util.List;

public class DemoMethodReference {

	public static void main(String[] args) {
        List<String> names = Arrays.asList("John", "Anna", "Mike");

        names.forEach(System.out::println);
    }
}
