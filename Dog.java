package com.tns.kprit.IOC.object;

import org.springframework.stereotype.Component;

@Component
public class Dog implements Animal{

	public String sound() {
		return "Woof";
	}
}
