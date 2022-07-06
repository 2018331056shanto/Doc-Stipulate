package com.stipulate.Entity;
import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class User {
	@Id
	private int id;
	private String name;
	private String userName;
	public User() {}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
}

