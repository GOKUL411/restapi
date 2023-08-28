package com.example.day8.model;

import java.util.List;

import jakarta.persistence.CascadeType;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
//import jakarta.persistence.OneToOne;

@Entity
public class StudentModel {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int stuId;

	private String stuName;

	//@OneToOne(cascade=CascadeType.ALL,fetch=FetchType.LAZY)
	@OneToMany(cascade=CascadeType.ALL,fetch=FetchType.LAZY)
	@JoinColumn(name="address")

	private List<Address> address;

	public int getStuId() {
		return stuId;
	}

	public void setStuId(int stuId) {
		this.stuId = stuId;
	}

	public String getStuName() {
		return stuName;
	}

	public void setStuName(String stuName) {
		this.stuName = stuName;
	}

	public List<Address> getAddress() {
		return address;
	}

	public void setAddress(List<Address> address) {
		this.address = address;
	}
	

	
}
