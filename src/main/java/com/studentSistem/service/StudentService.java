package com.studentSistem.service;

import java.util.List;

import com.studentSistem.model.Student;

public interface StudentService {
	public Student saveStudent(Student student);
	public List<Student> getAllStudents();
	
}
