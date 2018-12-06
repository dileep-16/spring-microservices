package com.springbootrestful.com.restfulwebservices.Students;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class StudentNotFoundException extends RuntimeException {
    public StudentNotFoundException(String message) {
		// TODO Auto-generated constructor stub
		super(message);
}
}
