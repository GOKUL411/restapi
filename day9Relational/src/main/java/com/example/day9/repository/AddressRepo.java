package com.example.day9.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.day9.model.Address;


public interface AddressRepo extends JpaRepository<Address, Long>  {

}
