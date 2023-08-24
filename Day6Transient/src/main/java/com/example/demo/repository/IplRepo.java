package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.IplModel;

public interface IplRepo extends JpaRepository<IplModel, Integer> {

}
