package com.management.MotorMS.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import com.management.MotorMS.dto.MotorDTO;
import com.management.MotorMS.service.MotorService;

@RestController
@EnableAutoConfiguration
@CrossOrigin

public class MotorController {
	
	Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	MotorService motorservice;

	// Fetches all motor details based on phonenumber
	@GetMapping(value = "/motor/{phonenumber}/motordetails",  produces = MediaType.APPLICATION_JSON_VALUE)
	public List<MotorDTO> getAllmotordetails(@PathVariable("phonenumber") String phonenumber) {
		return motorservice.getAllmotordetails(phonenumber);
	}
	// To get a motor details based on policynumber
	@GetMapping(value = "/motor/{policynumber}", produces = MediaType.APPLICATION_JSON_VALUE)
	public MotorDTO getmotordetails(@PathVariable("policynumber") String policynumber) {
		
		return motorservice.getmotordetails(policynumber);
		
	}


}
