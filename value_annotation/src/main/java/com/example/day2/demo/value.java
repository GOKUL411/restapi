package com.example.day2.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class value {
	@Value("33")
	public int regNum;
	@Value("GOKUL")
	public String name;
	@RequestMapping("/display")
	public String display()
	{
		return "My name is "+name+" reg number is "+regNum;
	}
}
