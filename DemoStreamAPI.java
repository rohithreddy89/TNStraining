package com.tns.kprit.StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class DemoStreamAPI {

	public static void main(String[] args) {
		
		List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6);

		//Filter
        long count = nums.stream().filter(n -> n % 2 == 0).count();
        System.out.println("Even count: " + count);
        
        //Map
        List<Integer> doubled = nums.stream().map(n -> n*2).collect(Collectors.toList());
        System.out.println(doubled);
        
        //Max
        Optional<Integer> max = nums.stream().max(Integer::compareTo);
        System.out.println(max);
	}
}
