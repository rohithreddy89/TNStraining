package com.tns.kprit.DependencyInjection.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tns.kprit.DependencyInjection.service.GreetingService;

@RestController
public class GreetingController {

	private GreetingService greetingService = new GreetingService();

	public GreetingController(GreetingService greetingService) {
		this.greetingService = greetingService;
	}

	@GetMapping("/greet")
	public String greet() {
		return greetingService.Greet();
	}
	
	
}
