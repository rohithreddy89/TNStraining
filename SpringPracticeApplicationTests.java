package com.tns.kprit.SpringPractice;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.web.bind.annotation.RestController;

@SpringBootTest
@RestController
class SpringPracticeApplicationTests {

	@Test
	
	String contextLoads() {
		return "Welcome to spring classes";
	}

}
