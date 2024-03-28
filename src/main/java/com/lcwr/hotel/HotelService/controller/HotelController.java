package com.lcwr.hotel.HotelService.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lcwr.hotel.HotelService.entites.Hotel;
import com.lcwr.hotel.HotelService.services.HotelService;

@RestController
@RequestMapping("/hotels")
public class HotelController {

	@Autowired
	private HotelService hotelService;

	// create
	@PostMapping
	public ResponseEntity<Hotel> createHotel(@RequestBody Hotel hotel) {
		Hotel Hotel1 = hotelService.create(hotel);
		return ResponseEntity.status(HttpStatus.CREATED).body(Hotel1);

	}

	// getall

	@GetMapping
	public ResponseEntity<List<Hotel>> getAllhotels() {

		List<Hotel> hotels = hotelService.getAll();
		return ResponseEntity.status(HttpStatus.OK).body(hotels);

	}

	// get single
	@GetMapping("/{id}")
	public ResponseEntity<Hotel> getSingleHotel(@PathVariable String id){
		Hotel hotel1 = hotelService.getPerticular(id);
		return ResponseEntity.status(HttpStatus.OK).body(hotel1) ;
		
	}
}
