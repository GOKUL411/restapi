package com.example.day9.repository;



import org.springframework.data.jpa.repository.JpaRepository;

import com.example.day9.model.StudentModel;



public interface StudentRepo extends JpaRepository<StudentModel, Long>  {


	

}
