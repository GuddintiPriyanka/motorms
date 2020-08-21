package com.management.MotorMS.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "motor")
public class Motor {
	@Column(name = "NAME")
    String name;
	@Column(name = "EMAIL")
	String email;
	@Column(name= "PHONENUMBER")
	String phonenumber;

	
    @Column(name = "PASSWORD")
	String password;
    @Id
	@Column(name="POLICYNUMBER")
	String policynumber;
	
	@Column(name = "DUEAMOUNT")
	Double dueamount;
	
	@Column(name="DURATION", nullable = false)
	LocalDate duration;
	
	
public LocalDate getDuration() {
		return duration;
	}
	public void setDuration(LocalDate duration) {
		this.duration = duration;
	}
public String getPhonenumber() {
	return phonenumber;
}
public String getPolicynumber() {
	return policynumber;
}
public void setPhonenumber(String phonenumber) {
	this.phonenumber = phonenumber;
}
public void setPolicynumber(String policynumber) {
	this.policynumber = policynumber;
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

	
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	

	public Double getDueamount() {
		return dueamount;
	}

	public void setDueamount(Double dueamount) {
		this.dueamount = dueamount;
	}
	
	

}
