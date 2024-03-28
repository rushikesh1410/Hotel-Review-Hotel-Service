package com.lcwr.hotel.HotelService.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lcwr.hotel.HotelService.entites.Hotel;
@Repository
public interface HotelRepository extends JpaRepository<Hotel, String>{

}
