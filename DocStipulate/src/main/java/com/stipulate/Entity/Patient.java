package com.stipulate.Entity;

import java.util.Date;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

import org.hibernate.annotations.GenericGenerator;
@Entity
public class Patient {
	@Id
	 @GenericGenerator(name = "uuid2", strategy = "uuid2")
    @GeneratedValue(generator = "uuid2")
	private String id;
	
	@NotBlank
	private String fname;
	@NotBlank
	private String lname;
	
	private Date dob;

	@OneToOne(cascade = CascadeType.ALL, optional = false, orphanRemoval = true)
	@JoinColumn(name = "user_id", nullable = false, unique = true)
	private User user;





	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Patient() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Patient [id=" + id + ", fname=" + fname + ", lname=" + lname + ", dob=" + dob + ", user=" + user + "]";
	}
	

}
