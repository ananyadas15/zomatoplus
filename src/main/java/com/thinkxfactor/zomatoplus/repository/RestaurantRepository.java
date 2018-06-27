package com.thinkxfactor.zomatoplus.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.thinkxfactor.zomatoplus.models.Restaurant;

public interface RestaurantRepository extends JpaRepository<Restaurant, Long>{
	
	List<Restaurant> findAllByCity(String city);
	Restaurant findByName(String name);

}
