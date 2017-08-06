package com.javafasci.jpa.jpademo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.javafasci.jpa.jpademo.model.City;

@Repository
public interface CityRepository extends CrudRepository<City, Integer>{
	
	
}
