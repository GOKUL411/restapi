package com.example.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.project.model.ApplianceModel;



public interface ApplianceRepo extends JpaRepository<ApplianceModel, Integer> {

}
