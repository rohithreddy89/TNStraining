package com.tns.kprit.RestAPI.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class MessageController {

	@GetMapping("/Message")
	public String Welcome() {
		return "Welcome to Spring boot REST API";
	}

}