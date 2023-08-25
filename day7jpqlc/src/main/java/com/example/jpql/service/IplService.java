package com.example.jpql.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.jpql.model.IplModel;
import com.example.jpql.repository.IplRepo;


@Service
public class IplService {
	@Autowired
	public IplRepo hrepo;
	
	public String saveIpl(IplModel h)
	{
		hrepo.save(h);
		return "Data is saved to database";
	}
	public List<IplModel> getIpl()
	{
		return hrepo.findAll();
	}
	
	//get all the data
		public List<IplModel> getAllrows()
		{
			return hrepo.getAllRows();
		}
		public List<IplModel> getSpecrows(String add, String name) {
			// TODO Auto-generated method stub
			return hrepo.getSpecRows(add, name);
		}
		
		  public int deleteRowbyid(int id) {
		        return hrepo.deletedId(id);
		    }

		    public Integer updateRow(String add, int id) {
		        return hrepo.updateByid(add, id);
		    }
		    public List<IplModel> getByname(String name) {
		        return hrepo.getByname(name);
		    }
		
		

}
