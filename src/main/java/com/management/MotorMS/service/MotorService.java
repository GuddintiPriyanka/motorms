package com.management.MotorMS.service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.management.MotorMS.dto.MotorDTO;
import com.management.MotorMS.entity.Motor;
import com.management.MotorMS.repository.MotorRepository;


@Service
public class MotorService {
	
	Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	MotorRepository motorRepo;

	// Fetches all motor details
	public List<MotorDTO> getAllmotordetails(String phonenumber) {
		List<Motor> motors = motorRepo.findByPhonenumber(phonenumber);
		List<MotorDTO> motordtos = new ArrayList<>();
	
		for (Motor motor : motors) {
			MotorDTO mdto = MotorDTO.valueOf(motor);
			LocalDate today=LocalDate.now();
		
			LocalDate duration=mdto.getDuration();
			
			if((duration.getYear()>today.getYear() && duration.getMonthValue()>today.getMonthValue()) || mdto.getDueamount()>2000  ){
				
				logger.info("The policy is on due..Please check the due amount");
				
			
		    }
				
			motordtos.add(mdto);
		}

		logger.info("Motor details : {}", motordtos);
		return motordtos;
	}

	// To get a motor based on policynumber
	public MotorDTO getmotordetails(String policynumber) {
		
		return MotorDTO.valueOf(motorRepo.getOne(policynumber));
		
		
		
	}
	
	
	
	

}
