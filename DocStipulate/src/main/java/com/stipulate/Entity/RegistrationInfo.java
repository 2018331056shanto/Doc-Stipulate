package com.stipulate.Entity;

import java.io.File;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
@Access(AccessType.FIELD)
@Embeddable
public class RegistrationInfo  {
	
	@NotBlank
	@Column(unique = true)
	private String email;
	@NotBlank
	@Column(name="lisenceFile",unique = true)
	private File lisenceFile;
	private Boolean status=false;
	private String role=null;
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
	public RegistrationInfo() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "RegistrationInfo [email=" + email + ", lisenceFile=" + lisenceFile + ", status=" + status + ", role="
				+ role + "]";
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

	
	
	
}
