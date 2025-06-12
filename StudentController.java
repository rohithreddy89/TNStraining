package com.tns.kprit.StudentCrud.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tns.kprit.StudentCrud.Entity.Student;
import com.tns.kprit.StudentCrud.Service.StudentServices;

@RestController
@RequestMapping("/api/student")
public class StudentController {

	@Autowired
	private StudentServices service;
	
	@GetMapping
	public List<Student> getAllStudents(){
		return service.getAllStudents();
	}
	
	@GetMapping("/{id}")
	public Student getStudentById(@PathVariable Long id) {
		return service.getStudentById(id);
	}
	
	@PostMapping
	public Student createStudent(@RequestBody Student student) {
		return service.createStudent(student);
	}
	
	@PutMapping("/{id}")
	public Student updateStudent(@PathVariable Long id, @RequestBody Student student) {
		return service.updateStudent(id, student);
	}
	
	@DeleteMapping("/{id}")
	public void deleteStudent(@PathVariable Long id) {
		service.deleteStudent(id);
	}
}
