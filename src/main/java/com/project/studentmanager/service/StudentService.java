package com.project.studentmanager.service;

import java.util.List;

import com.project.studentmanager.model.Student;


public interface StudentService {

	public Student saveStudent(Student student);
	
	public List<Student> fetchStudent();
	
	public Student deleteStudent(Student student);
}
