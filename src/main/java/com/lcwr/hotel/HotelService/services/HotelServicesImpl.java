package com.lcwr.hotel.HotelService.services
;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lcwr.hotel.HotelService.entites.Hotel;
import com.lcwr.hotel.HotelService.exceptions.ResourceNotFoundException;
import com.lcwr.hotel.HotelService.repositories.HotelRepository;
@Service
public class HotelServicesImpl implements HotelService {

	@Autowired
	private HotelRepository hotelRepository;
	
	
	@Override
	public Hotel create(Hotel hotel) {
		
		String hotelId =UUID.randomUUID().toString();
		hotel.setId(hotelId);
		
		return hotelRepository.save(hotel);
	}

	@Override
	public List<Hotel> getAll() {
		return hotelRepository.findAll();
	}

	@Override
	public Hotel getPerticular(String id) {
		Hotel hotel1= hotelRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Hotel given Id not found!!"));
	 return hotel1;
	}

}
