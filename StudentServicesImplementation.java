package com.tns.kprit.StudentCrud.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tns.kprit.StudentCrud.Entity.Student;
import com.tns.kprit.StudentCrud.Repositary.StudentRepositary;

@Service
public  class StudentServicesImplementation implements StudentServices {

	@Autowired
	private StudentRepositary repositary;
	
	@Override
	public List<Student> getAllStudents(){
		return repositary.findAll();
	}
	
	@Override
	public Student getStudentById(Long id) {
		return repositary.findById(id).orElse(null);
	}
	
	@Override
	public Student createStudent(Student student) {
		return repositary.save(student);
	}
	
	@Override
	public Student updateStudent(Long id, Student student) {
		Optional<Student> existing = repositary.findById(id);
		if(existing.isPresent()) {
			Student s = existing.get();
			s.setName(student.getName());
			s.setDepartment(student.getDepartment());
			return repositary.save(s);
		}
		return null;
	}
	
	@Override
	public void deleteStudent(Long id) {
		repositary.deleteById(id);
	}
}
