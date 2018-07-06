package com.example.model;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class StudentService {
	List<Student> student = new ArrayList<Student>();
	public StudentService() {
		student.add(new Student(1,"akhil", "yara", "denver"));
		student.add(new Student(1,"srav", "yara", "india"));
	}
	
	public List<Student> listStudents() {
		return student;
	}
	
	public Student studentid(int id) {
		return student.get(id);
	}
}
