package com.example.swagger.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.swagger.model.UserModel;
import com.example.swagger.service.UserService;

import io.swagger.v3.oas.annotations.tags.Tag;



@RestController
public class UserController {
	@Autowired
	public UserService aserv;
	
	@PostMapping("/postU")
	private String postHotel(@RequestBody UserModel hr)
	{
		aserv.saveHotel(hr);
		return "appliance id of the customer data is saved";
	}
	
	@GetMapping("/getApplianceid")
	@Tag(name="get users", description="get all the values")
	public List<UserModel>getApplianceInfo()
	{
		return aserv.getHotel();
	}
	
	@PutMapping("/updateApplianceid")
	public UserModel updateApplianceInfo(@RequestBody UserModel ha)
	{
		return aserv .updateAppliance(ha);
	}
	@DeleteMapping("/deleteApplianceid/{id}")
	public String deleteAppliance(@PathVariable("id") int hid)
	{
		aserv.updateAppliance(hid);
		return "The appliance id belong to the customer id "+hid+" is deleted";
	}
	
	
}
