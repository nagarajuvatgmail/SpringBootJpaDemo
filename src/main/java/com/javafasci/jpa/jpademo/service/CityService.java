package com.javafasci.jpa.jpademo.service;

import java.util.List;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javafasci.jpa.jpademo.model.City;
import com.javafasci.jpa.jpademo.repository.CityRepository;

@Service
public class CityService {
	
	private static final Logger LOG = LogManager.getLogger(CityService.class);
	
	@Autowired
	private CityRepository cityRepo;
	
	public List<City> getAllCities(){
		LOG.info("In getAllCities of CityService");
		return (List<City>) cityRepo.findAll();
	}
	
	public City updateCity(City city){
		LOG.info("In updateCity of CityService");
		return cityRepo.save(city);
	}
	
	public City getCityById(int cityId){
		LOG.info("In getCityById of CityService");
		return cityRepo.findOne(cityId);
	}
}
