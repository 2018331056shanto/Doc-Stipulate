package com.stipulate.Entity;




import java.sql.Timestamp;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.query.criteria.internal.expression.function.CurrentTimeFunction;
import org.springframework.boot.context.properties.bind.DefaultValue;

@Entity
@Table(name="verification")
public class Verification {
	
	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	  private long id;
	@NotBlank
	private String email;
	@Column(name="token")
	@NotBlank
	private String token;
	@CreationTimestamp
	@Column(name="timestamp")
	@NotNull
	private Timestamp createdAt;
	public Verification() {
		
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getToken() {
		return token;
	}
	public void setToken(String token) {
		this.token = token;
	}
	public Timestamp getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(Timestamp createdAt) {
		this.createdAt = createdAt;
	}
	
	
	

}
