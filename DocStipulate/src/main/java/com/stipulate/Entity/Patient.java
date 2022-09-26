package com.stipulate.Entity;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

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
	
	@OneToOne
	@JoinColumn(name="FK_userid",referencedColumnName = "id")
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
