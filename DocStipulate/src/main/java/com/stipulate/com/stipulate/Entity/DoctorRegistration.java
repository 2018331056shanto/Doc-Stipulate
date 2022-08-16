package com.stipulate.Entity;


import java.io.File;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
@Table(name = "doctor")
public class DoctorRegistration {
	
	@EmbeddedId
	@NotBlank
	private LisenceNumberID lisenceNumber;
//	@Embedded
//	private RegistrationInfo registrationInfo;
	@NotBlank
	@Size(max = 20)
	private String fName;
	@NotBlank
	@Size(max=20)
	private String lName;
	@NotBlank
	@Size(max=50,min=8)
	private String password;
	@NotBlank
	@Column(unique = true)
	private String email;
	
	@Column(name="lisenceFile",unique = true)
	private File lisenceFile;
	private Boolean status=false;
	private String role=null;
	@Override
	public String toString() {
		return "DoctorRegistration [lisenceNumber=" + lisenceNumber + ", fName=" + fName + ", lName=" + lName
				+ ", password=" + password + ", email=" + email + ", lisenceFile=" + lisenceFile + ", status=" + status
				+ ", role=" + role + "]";
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
	public String getfName() {
		return fName;
	}
	public void setfName(String fName) {
		this.fName = fName;
	}
	public String getlName() {
		return lName;
	}
	public void setlName(String lName) {
		this.lName = lName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

	public DoctorRegistration() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public LisenceNumberID getLisenceNumber() {
		return lisenceNumber;
	}
	public void setLisenceNumber(LisenceNumberID lisenceNumber) {
		this.lisenceNumber = lisenceNumber;
	}
//	public RegistrationInfo getEmail() {
//		return registrationInfo;
//	}
//	public void setEmail(RegistrationInfo email) {
//		this.registrationInfo = email;
//	}
//	@Override
//	public String toString() {
//		return "DoctorRegistration [lisenceNumber=" + lisenceNumber + ", email=" + registrationInfo + ", fName=" + fName
//				+ ", lName=" + lName + ", password=" + password + "]";
//	}
//	
//	
	
	
}
