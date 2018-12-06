package com.springbootrestful.com.restfulwebservices.Students;

import java.util.*;

import org.springframework.stereotype.Component;

import com.springbootrestful.com.restfulwebservices.Students.*;
import com.springbootrestful.com.restfulwebservices.user.User;
@Component
public class studentDAOService {
	private static List<Student> students=new ArrayList<>();
	private static int studentsCount=5;
	static
	 {
       students.add(new Student(101,"dileep","NIET"));
       students.add(new Student(102,"rohit","gl bajaja"));
       students.add(new Student(103,"shikha","vnit"));
       students.add(new Student(104,"arun","iit"));
       students.add(new Student(105,"neha","NIET"));
      
	 }
	
	public Student save(Student student)
	{   if(student.getId()==null) {
		student.setId(++studentsCount);
	} students.add(student);
		return student;
		
	}
	public List<Student> findAll() {
		// TODO Auto-generated method stub
		return students;
	}
	
	public Student findOne(int id)
	{
		for(Student student:students)
		{
			if(student.getId()==id)
			{
				return student;
			}
		}
		return null;
		
	}
	public Student deleteById(int id)
	{
		Iterator<Student> itr=students.iterator();
		while(itr.hasNext())
		{
			Student student=itr.next();
			if(student.getId()==id)
			{
				itr.remove();
				return student;
			}
		}
		
		return null;
		
	}
}




