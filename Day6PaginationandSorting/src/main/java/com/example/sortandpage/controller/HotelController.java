package com.example.sortandpage.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.sortandpage.model.HotelModel;
import com.example.sortandpage.service.HotelService;



@RestController
public class HotelController {
	@Autowired
	public HotelService hserv;
	@PostMapping("/postHotel")
	private String postHotel(@RequestBody HotelModel hr)
	{
		hserv.saveHotel(hr);
		return "data saved";
	}
	
	@GetMapping("/getHotel")
	public List<HotelModel>getHotelInfo()
	{
		return hserv.getHotel();
	}
	
	@PutMapping("/updateHotel")
	public HotelModel updateHotelInfo(@RequestBody HotelModel ha)
	{
		return hserv .updateHotel(ha);
	}
	@DeleteMapping("/deleteHotel/{id}")
	public String deleteHotel(@PathVariable("id") int hid)
	{
		hserv.deleteHotel(hid);
		return "Hotel with Id "+hid+" id deleted";
	}
	
	//delete mapping using 
	
	

	@DeleteMapping("/byReqParm")
	public String removeByRequestParam(@RequestParam("id") int id)
	{
		hserv.deleteHotel(id);
		return "Hotel with Id "+id+" id deleted";
	}
	
	@DeleteMapping("/deleteHotelif/{id}")
	public ResponseEntity<String>deleteHotelInfo(@PathVariable int id){
		boolean deleted = hserv.deleteHotel(id);
		
		if(deleted) {
			return ResponseEntity.ok("Hotel with ID "+id+"Deleted successfully");
		}else {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Hotel with ID"+id+"not found");
		}
	}
	
	//Delete Mapping using path variable
	
		@DeleteMapping("/DeleteHotel/{id}")
		public String removeHotel(@PathVariable("id") int hid)
		{
			hserv.deleteHotel(hid);
			return "Hotel with Id "+hid+" id deleted";
		}
		
		//delete mapping using request param
		

		@DeleteMapping("/deletedHotel/{id}")
		public String deleteHotel1(@PathVariable("id") int id)
		{
			hserv.deleteHotel(id);
			return "Hotel with Id "+id+" id deleted";
		}
		//get user by id
				@GetMapping("/users/{userId}")
		public ResponseEntity<?>getUserById(@PathVariable int userId){
			Optional<HotelModel>hotel=hserv.getUserId(userId);
			
			if(hotel!=null) {
				return ResponseEntity.ok(hotel);
				
			}
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body("User not available with id");

			

		}
				
				@GetMapping("/sortAsc/{name}")
				public List<HotelModel> sortAsc(@PathVariable("name") String name) {
				    return hserv.sortByAsc(name);
				}

				@GetMapping("/sortDsc/{name}")
				public List<HotelModel> sortDsc(@PathVariable("name") String name) {
				    return hserv.sortByDsc(name);
				}
				 @GetMapping("/pagination/{num}/{size}")
				    public List<HotelModel> paginationEx(@PathVariable("num") int num, @PathVariable("size") int size) {
				        return hserv.pagination(num, size);
				    }

				    @GetMapping("/paginationAndSort/{num}/{size}/{name}")
				    public List<HotelModel> paginationAndSort(@PathVariable("num") int num,
				                                              @PathVariable("size") int size,
				                                              @PathVariable("name") String name) {
				        return hserv.paginationAndSorting(num, size, name);
				    }
}
