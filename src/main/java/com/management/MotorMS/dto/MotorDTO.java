package com.management.MotorMS.dto;

import java.time.LocalDate;

import com.management.MotorMS.entity.Motor;

public class MotorDTO {

    String name;
	
	String email;

	String phonenumber;
	
	String password;
	
	String policynumber;
	
	
	
	Double dueamount;
	LocalDate duration;

	public LocalDate getDuration() {
		return duration;
	}



	public void setDuration(LocalDate duration) {
		this.duration = duration;
	}

	public MotorDTO() {
		super();
	}
		public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhonenumber() {
		return phonenumber;
	}
	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getPolicynumber() {
		return policynumber;
	}
	public void setPolicynumber(String policynumber) {
		this.policynumber = policynumber;
	}

	public Double getDueamount() {
		return dueamount;
	}
	public void setDueamount(Double dueamount) {
		this.dueamount = dueamount;
	}

	public Motor createEntity(){
        Motor motor = new Motor();
        motor.setPhonenumber(this.getPhonenumber());
        motor.setPolicynumber(this.getPolicynumber());
        motor.setDueamount(this.getDueamount());
        motor.setEmail(this.getEmail());
        motor.setName(this.getName());
        motor.setPassword(this.getPassword());
        motor.setDuration(this.getDuration());
        return motor;
    }


	
	
	// Converts Entity into DTO
	
	public static MotorDTO valueOf(Motor motor) {
		MotorDTO motordto=new MotorDTO();
		motordto.setDueamount(motor.getDueamount());
		motordto.setEmail(motor.getEmail());
		motordto.setName(motor.getName());
		motordto.setPassword(motor.getPassword());
		motordto.setPhonenumber(motor.getPhonenumber());
		motordto.setPolicynumber(motor.getPolicynumber());
		motordto.setDuration(motor.getDuration());
		return motordto;
	}



	@Override
	public String toString() {
		return "MotorDTO [name=" + name + ", email=" + email + ", phonenumber=" + phonenumber + ", password=" + password
				+ ", policynumber=" + policynumber + ", dueamount=" + dueamount
				+ ", duration=" + duration + "]";
	}
	
	

}
