package com.tns.kprit.IOC.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tns.kprit.IOC.object.Animal;

@RestController
public class Controller {

	private final Animal  animal ;

	public Controller(Animal animal) {
		this.animal = animal;
	}
	
	@GetMapping("/IOC")
	public String animalSound() {
		return "Animal says"+animal.sound();
	}
	
}
