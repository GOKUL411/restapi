package com.example.sortandpage.service;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.sortandpage.model.HotelModel;
import com.example.sortandpage.repository.HotelRepo;



@Service
public class HotelService {
	@Autowired
	public HotelRepo hrepo;
	
	public String saveHotel(HotelModel h)
	{
		hrepo.save(h);
		return "Data is saved to database";
	}
	public List<HotelModel> getHotel()
	{
		return hrepo.findAll();
	}
	
	public HotelModel updateHotel(HotelModel hm)
	{
		return hrepo.saveAndFlush(hm);
	}
	
	
	
	public boolean deleteHotelif(int hotelId)
	{
		if(hrepo.existsById(hotelId))
		{
			hrepo.deleteById(hotelId);
			return true;
		}
		return false;
	}
	
	//delete the data
	
	public boolean deleteHotel(int hotel_id)
	{
		System.out.println("Deleted");
		hrepo.deleteById(hotel_id);
		return false;
	}
	// with id
	
	public Optional<HotelModel> getUserId(int userId) {
	    Optional<HotelModel> hotel = hrepo.findById(userId);
	    if (hotel.isPresent()) {
	        return hotel;
	    } else {
	        return null; // or return null if necessary
	    }
	}
	
	//sorting
	public List<HotelModel> sortByAsc(String propertyName) {
	    return hrepo.findAll(Sort.by(propertyName).ascending());
	}

	public List<HotelModel> sortByDsc(String propertyName) {
	    return hrepo.findAll(Sort.by(propertyName).descending());
	}
	
	//pagination
	public List<HotelModel>pagination(int pageNo,int pageSize)
	{
		Page<HotelModel> cont=hrepo.findAll(PageRequest.of(pageNo, pageSize));
		return cont.getContent();
	}
	//pagination and sorting 
	public List<HotelModel>paginationAndSorting(int pageNo,int pageSize,String propertyName)
	{
		Page<HotelModel> cont=hrepo.findAll(PageRequest.of(pageNo, pageSize,Sort.by(propertyName)));
		return cont.getContent();
	}
	

}
