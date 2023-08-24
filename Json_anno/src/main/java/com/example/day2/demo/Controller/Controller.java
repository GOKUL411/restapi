package com.example.day2.demo.Controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.day2.demo.model.Studentprofile;

@RestController
public class Controller {
	@GetMapping("disp")
	public List<Studentprofile>fun()
	{
		return Arrays.asList(new Studentprofile(1,"gokul",19));
	}

}
