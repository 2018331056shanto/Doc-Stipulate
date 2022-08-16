package com.stipulate.Entity;

import java.io.File;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name = "diagonistic")
public class DiagnosticRegistration {
	
	@EmbeddedId
	@NotBlank
	private LisenceNumberID lisenceNumber;
	@NotBlank
	private String name;
	@NotBlank
	private String location;
	@Email
	@NotBlank
	private String email;
	@Column(name="lisenceFile",unique = true)
	private File lisenceFile;
	private Boolean status=false;
	private String role=null;
	
	public LisenceNumberID getLisenceNumber() {
		return lisenceNumber;
	}
	public void setLisenceNumber(LisenceNumberID lisenceNumber) {
		this.lisenceNumber = lisenceNumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public File getLisenceFile() {
		return lisenceFile;
	}
	public void setLisenceFile(File lisenceFile) {
		this.lisenceFile = lisenceFile;
	}
	public Boolean getStatus() {
		return status;
	}
	public void setStatus(Boolean status) {
		this.status = status;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	@Override
	public String toString() {
		return "DiagnosticRegistration [lisenceNumber=" + lisenceNumber + ", name=" + name + ", location=" + location
				+ ", email=" + email + ", lisenceFile=" + lisenceFile + ", status=" + status + ", role=" + role + "]";
	}
	
}
