package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.IplModel;
import com.example.demo.service.IplService;



@RestController
public class IplController {
	@Autowired
	public IplService hserv;
	@PostMapping("/postIpl")
	private String postIpl(@RequestBody IplModel hr)
	{
		hserv.saveIpl(hr);
		return "data saved";
	}
	
	@GetMapping("/getIpl")
	public List<IplModel>getHotelInfo()
	{
		return hserv.getIpl();
	}
}
