package com.javafasci.jpa.jpademo.controllers;

import java.util.List;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.javafasci.jpa.jpademo.model.UserDetails;
import com.javafasci.jpa.jpademo.service.UserDetailsService;

@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@Controller
public class UserDetailsController {
	
	private static final Logger LOG = LogManager.getLogger(UserDetailsController.class);
	
	@Autowired
	private UserDetailsService userDetailsService;
	
	@RequestMapping("/getAllUsers")
	@ResponseBody
	public List<UserDetails> getAllUsers() {
		LOG.info("In getAllUsers of Controller");
		return userDetailsService.getAllUsers();
	}
	
	@PostMapping("/addUser")
	@ResponseBody
	public UserDetails addUser(@RequestBody UserDetails user){
		LOG.info("In addUser of Controller");
		return userDetailsService.addUser(user);
	}
	
	@DeleteMapping(path ={"/deleteUser/{id}"})
	@ResponseBody
    public UserDetails delete(@PathVariable("id") int id) {
		LOG.info("In delete of Controller");
        return userDetailsService.delete(id);
    }
	
}
