package com.example.day2.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.example.day2.demo.model.petrolBunk;
import com.example.day2.demo.repository.Fuelrepo1;





@Service

public class FuelService<petrolbunk> {

	@Autowired

	Fuelrepo1 frepo;

	public petrolBunk saveDetails(petrolBunk p)

	{

		return frepo.save(p);

	}

	public List<petrolBunk> getDetails()

	{

		return frepo.findAll();

	}

}