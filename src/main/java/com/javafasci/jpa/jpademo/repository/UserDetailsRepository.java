package com.javafasci.jpa.jpademo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.javafasci.jpa.jpademo.model.UserDetails;

@Repository
@CrossOrigin(origins = "http://localhost:4200")
public interface UserDetailsRepository extends CrudRepository<UserDetails, Integer>{
	
	
}
