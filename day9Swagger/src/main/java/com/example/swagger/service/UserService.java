package com.example.swagger.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.swagger.model.UserModel;
import com.example.swagger.repository.UserInterface;



@Service
public class UserService {
	@Autowired
	public UserInterface arepo;
	//post
	public String saveHotel(UserModel sc)
	{
		arepo.save(sc);
		return "Data is saved to database";
	}
	//get
	public List<UserModel> getHotel()
	{
		return arepo.findAll();
	}
	//put
	public UserModel updateHotel(UserModel hm)
	{
		return arepo.saveAndFlush(hm);
	}
	
	//delete the data
	
	public boolean deleteHotel(int customer_id)
	{
		System.out.println("Deleted the following customer id successfully");
		arepo.deleteById(customer_id);
		return false;
	}
	public UserModel updateAppliance(UserModel ha) {
		// TODO Auto-generated method stub
		return null;
	}
	public void updateAppliance(int hid) {
		// TODO Auto-generated method stub
		
	}



}
