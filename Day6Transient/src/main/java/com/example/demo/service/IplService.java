package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.IplModel;
import com.example.demo.repository.IplRepo;



@Service
public class IplService {
	@Autowired
	public IplRepo hrepo;
	
	public String saveIpl(IplModel h)
	{
		hrepo.save(h);
		return "Data is saved to database";
	}
	public List<IplModel> getIpl()
	{
		return hrepo.findAll();
	}
}
	