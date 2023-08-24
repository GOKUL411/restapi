package com.example.day2.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class color {
	private String colour="Green";
	@GetMapping("/di")
	public String display()
	{
		return "My favourite color is "+colour;
	}

}
