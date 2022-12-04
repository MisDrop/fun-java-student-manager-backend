package com.project.studentmanager.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.studentmanager.model.Student;
import com.project.studentmanager.repo.StudentRepo;

@Service
public class StudentServiceImpl implements StudentService{

	@Autowired
	StudentRepo studentRepo;
	
	
	@Override
	public Student saveStudent(Student student) {
	return studentRepo.save(student);
	}


	@Override
	public List<Student> fetchStudent() {		
		return studentRepo.findAll();
	}


	@Override
	public Student deleteStudent(Student student) {
		studentRepo.delete(student);
		return student;
	}
	
	

}
