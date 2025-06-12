package com.tns.kprit.StudentCrud.Service;

import java.util.List;

import com.tns.kprit.StudentCrud.Entity.Student;

public interface StudentServices {

	List<Student> getAllStudents();
	Student getStudentById(Long id);
	Student createStudent(Student student);
	Student updateStudent( Long id, Student student);
	void deleteStudent(Long id);
}
