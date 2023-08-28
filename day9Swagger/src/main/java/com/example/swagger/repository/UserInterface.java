package com.example.swagger.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.swagger.model.UserModel;


public interface UserInterface extends JpaRepository<UserModel, Integer> {

}
