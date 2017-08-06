package com.javafasci.jpa.jpademo.controllers;

import java.util.List;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.javafasci.jpa.jpademo.model.City;
import com.javafasci.jpa.jpademo.service.CityService;

@Controller
public class CityController {
	
	private static final Logger LOG = LogManager.getLogger(CityController.class);
	
	@Autowired
	private CityService cityService;
	
	@RequestMapping("/getAllCities")
	@ResponseBody
	public List<City> getAllCities() {
		LOG.info("In getAllCities of Controller");
		return cityService.getAllCities();
	}
	
	@RequestMapping(value="/updateCity",method = RequestMethod.PUT)
	@ResponseBody
	public City updateCity(@RequestBody City city) {
		LOG.info("In updateCity of Controller");
		return cityService.updateCity(city);
	}
	
	@RequestMapping(value="/getCityById/{id}",method = RequestMethod.GET)
	@ResponseBody
	public City getCityById(@PathVariable("id") int cityId) {
		LOG.info("In getCityById of Controller");
		LOG.info("Requested city Id : " + cityId);
		return cityService.getCityById(cityId);
	}
	
}
