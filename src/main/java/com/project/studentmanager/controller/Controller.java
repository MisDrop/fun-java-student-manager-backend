package com.project.studentmanager.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.studentmanager.model.Student;
import com.project.studentmanager.service.StudentServiceImpl;

@RestController
@RequestMapping("/student")
@CrossOrigin
public class Controller {
	
	@Autowired
	StudentServiceImpl service;

	@PostMapping("/add")
	public String addStudent(@RequestBody Student student) {
		service.saveStudent(student);
		return "a new student has been added";
	}
	
	@GetMapping("/get")
	public List<Student> fetchStudents(){
		return service.fetchStudent();
	}
	
	@PostMapping("/delete")
	public Student deleteStudent(@RequestBody Student student){
		return service.deleteStudent(student);
	}
	
	
}
