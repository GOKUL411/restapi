package com.example.day8.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.day8.model.StudentModel;
import com.example.day8.repository.StudentRepo;

@RestController
@RequestMapping("/")
public class StudentController {
    @Autowired
    StudentRepo srepo;

    @PostMapping("/postMo")
    public StudentModel saveDetails(@RequestBody StudentModel am) {
        return srepo.save(am);
    }

    @GetMapping("/getMo")
    public List<StudentModel> getDetails() {
        return srepo.findAll();
    }

    @DeleteMapping("/deleteMo/{id}")  // Added a slash before "deleteModel"
    public String deleteStudent(@PathVariable("id") int id) {
        srepo.deleteById(id);  // Actually delete the student from the repository
        return "The id " + id + " is deleted";
    }
}
