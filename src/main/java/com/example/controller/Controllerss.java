package com.example.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.mongodb.MStudents;
import com.example.mongodb.UserRepository;

@RestController
public class Controllerss {

	@Autowired
	private UserRepository ss;
	
	@GetMapping("/student")
	public List<MStudents> all() {
		return ss.findAll();
	}
	
	@GetMapping("/student/{id}")
	public Optional<MStudents> studentgetid(@PathVariable int id) {
		return(ss.findById(id));
	}
	
	@PostMapping("/student")
	public String studentdelid(@RequestBody MStudents student) {
	ss.insert(student);
	return "success";
	}
	@DeleteMapping("/student/{id}") 
	public String delete(@PathVariable int id) {
		
		ss.deleteById(id);
		return "success";
	}
	
	

}
