package com.stipulate.Entity;

import java.io.Serializable;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Embeddable;
import javax.validation.constraints.NotBlank;
@SuppressWarnings("serial")
@Embeddable
@Access(AccessType.FIELD)
public class LisenceNumberID implements Serializable {
	
	@NotBlank
	private String lisence;

	@Override
	public String toString() {
		return "LisenceNumberID [lisence=" + lisence + "]";
	}

	public String getLisence() {
		return lisence;
	}

	public void setLisence(String lisence) {
		this.lisence = lisence;
	}
	

}
