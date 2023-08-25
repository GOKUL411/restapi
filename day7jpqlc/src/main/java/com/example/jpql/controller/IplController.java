package com.example.jpql.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.jpql.model.IplModel;
import com.example.jpql.service.IplService;
import com.example.jpql.repository.IplRepo;

@RestController
public class IplController {
    @Autowired
    private IplService hserv; // Use private access modifier

    @Autowired
    private IplRepo hrepo; 

    @PostMapping("/postCric")
    public String postIpl(@RequestBody IplModel hr) {
        hserv.saveIpl(hr);
        return "data saved";
    }

    @GetMapping("/getCric")
    public List<IplModel> getHotelInfo() {
        return hserv.getIpl();
    }

    // Corrected access modifier, and use hrepo instead of a non-existing variable
    @GetMapping("/getSpecrows/{add}/{name}")
    public List<IplModel> getSpecrows(@PathVariable("add") String add, @PathVariable("name") String name) {
        return hrepo.getSpecRows(add, name);
    }

    @GetMapping("/getAllrows")
    public List<IplModel> getAllRows() { // Corrected method name
        return hserv.getAllrows();
    }

    @GetMapping("/getSpecific/{add}/{name}")
    public List<IplModel> getSpec(@PathVariable("add") String add, @PathVariable("name") String name) {
        return hserv.getSpecrows(add, name);
    }
    
    @DeleteMapping("/deleteRow/{id}")
    public String deleteRow(@PathVariable("id") int id) {
        return hserv.deleteRowbyid(id) + " deleted";
    }

    @PutMapping("/updateId/{add}/{id}")
    public String updateInfo(@PathVariable("add") String add, @PathVariable("id") int id) {
        return hserv.updateRow(add, id) + " rows updated";
    }
    @GetMapping("/getByName/{name}")
    public List<IplModel> getByname(@PathVariable("name") String name) {
        return hserv.getByname(name);
    }
}
