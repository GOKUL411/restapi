package com.example.day2.demo.application;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
@RestController
public class ValueThroughApplication
{
	@Value(value="${myName}")
	public String studentName;
	@Value(value="${age}")
	public int age;
	@Value(value="${condition}")
	public boolean condition;
	@GetMapping("/student")
	public String displayStudent()
	{
		return "My name is "+studentName+" Age is "+age+" "+condition;			
	}
}
