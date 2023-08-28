package com.example.swagger.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="usermodel")
public class UserModel {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY) 
	private int CustomerId; 
	@Column(name = "Customername")
	private String customerName;
	@Column(name = "Applianceid")
	private int applianceId;
	@Column(name = "Appliancetype")
	private String applianceType;
	public int getCustomerId() {
		return CustomerId;
	}
	public void setCustomerId(int customerId) {
		CustomerId = customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public int getApplianceId() {
		return applianceId;
	}
	public void setApplianceId(int applianceId) {
		this.applianceId = applianceId;
	}
	public String getApplianceType() {
		return applianceType;
	}
	public void setApplianceType(String applianceType) {
		this.applianceType = applianceType;
	}
	
	

}
