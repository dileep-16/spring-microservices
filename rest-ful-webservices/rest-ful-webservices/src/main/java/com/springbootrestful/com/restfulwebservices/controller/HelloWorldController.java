package com.springbootrestful.com.restfulwebservices.controller;

import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
	@Autowired
	private MessageSource messageSource;
	
	@GetMapping(path="/hello-world")
	public String helloworld()
	{
		return "HelloWorld";
	}

	@GetMapping(path="/hello-world-bean")
	public HelloWorldBean helloworldbean()
	{
		return new HelloWorldBean("HelloWorld");
	}
	
	@GetMapping(path="/hello-world/path-variable/{name}")
	public HelloWorldBean helloworldpathvariable(@PathVariable String name)
	{
		return new HelloWorldBean(String.format("HelloWorld, %s",name));
	}
	
	@GetMapping(path="/hello-world-internationalized")
	public String helloWorldInternationalized(@RequestHeader(name="Accept-Language",required=false)Locale locale)
	{
		String message=messageSource.getMessage("good.morning.message",null, locale);
		return message;
	}
	
	
}