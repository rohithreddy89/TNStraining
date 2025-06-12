package com.tns.kprit.StudentCrud.Repositary;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tns.kprit.StudentCrud.Entity.Student;

public interface StudentRepositary extends JpaRepository<Student, Long> {

}
