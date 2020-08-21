package com.management.MotorMS.repository;




import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.management.MotorMS.entity.Motor;

@Repository
public interface MotorRepository extends JpaRepository<Motor,String> {

	List<Motor> findByPhonenumber(String phonenumber);
	



}