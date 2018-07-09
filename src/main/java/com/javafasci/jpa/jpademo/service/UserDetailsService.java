package com.javafasci.jpa.jpademo.service;

import java.util.List;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javafasci.jpa.jpademo.model.UserDetails;
import com.javafasci.jpa.jpademo.repository.UserDetailsRepository;

@Service
public class UserDetailsService {
	
	private static final Logger LOG = LogManager.getLogger(UserDetailsService.class);
	
	@Autowired
	private UserDetailsRepository userDetailsRepo;
	
	public List<UserDetails> getAllUsers(){
		LOG.info("In getAllUsers of UserDetailsService");
		return (List<UserDetails>) userDetailsRepo.findAll();
	}
	
	public UserDetails addUser(UserDetails user){
		LOG.info("In addUser of UserDetailsService");
		return userDetailsRepo.save(user);
	}
	
    public UserDetails delete(int id) {
    	LOG.info("In delete of UserDetailsService");
		UserDetails user = findById(id);
		if(user != null){
			userDetailsRepo.delete(user);
		}
		return user;
    }
	
    public UserDetails findById(int id) {
    	LOG.info("In findById of UserDetailsService");
    	return userDetailsRepo.findOne(id);
    }
	
}
