package com.example.sortandpage.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.sortandpage.model.HotelModel;


public interface HotelRepo extends JpaRepository<HotelModel, Integer> {



}
