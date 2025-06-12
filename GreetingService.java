package com.tns.kprit.DependencyInjection.service;

import org.springframework.stereotype.Service;

@Service
public class GreetingService {

	public String Greet() {
		return "Hello from the greet method";
	}
}
