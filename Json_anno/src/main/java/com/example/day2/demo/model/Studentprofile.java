package com.example.day2.demo.model;


import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Studentprofile {
	@JsonIgnore
	private int id;
	@JsonProperty("reg")
	private String name;
	private int age;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Studentprofile(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}

}