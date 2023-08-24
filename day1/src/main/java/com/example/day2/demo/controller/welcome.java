package com.example.day2.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class welcome {
	@GetMapping("disp")
	public String Welcome()
	{
		return "Welcome String Boot !";
	}	
}
