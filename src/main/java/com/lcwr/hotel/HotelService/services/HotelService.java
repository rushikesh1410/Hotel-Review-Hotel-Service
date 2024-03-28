package com.lcwr.hotel.HotelService.services;

import java.util.List;

import com.lcwr.hotel.HotelService.entites.Hotel;

public interface HotelService  {
	
	//create 
	Hotel create(Hotel hotel);
	
	//get all
	List<Hotel> getAll();
	
	//get single
	Hotel getPerticular(String id);
}
