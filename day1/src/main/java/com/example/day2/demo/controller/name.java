package com.example.day2.demo.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class name {
	private String name="Iamneo";
	@GetMapping("/show")
	public String display()
	{
		return "Welcome "+name+"!";
	}
}
