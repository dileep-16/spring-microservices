package com.springbootrestful.com.restfulwebservices.Students;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentResource {
	@Autowired
	
	private studentDAOService service;
	private Student savedStudent;
    @GetMapping("/students")
	public List<Student> retriveAllStudents()
	{
		return service.findAll();
	}
	
	@GetMapping("/students/{id}")
	public Student retriveStudent(@PathVariable int id)
	{
		Student student=service.findOne(id);
		if(student==null)
			throw new StudentNotFoundException("id-"+id);
		return student;
		
	}
	@PostMapping("/students")
	public void createStudent(@RequestBody Student student)
	{
		Student savedStudent=service.save(student);
	}
	@DeleteMapping("/students/{id}")
	public void deleteStudent(@PathVariable int id)
	{
		Student student=service.deleteById(id);
		{
			if(student==null)
			{
				throw new StudentNotFoundException("id"+id);
			}
		}
	}
}
