package com.stipulate.Entity;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
@Table(name="user_table",
uniqueConstraints = @UniqueConstraint(
		columnNames = {"email","user_name"}
		)

)
//@Table(uniqueConstraints = {@UniqueConstraint(columnNames = {"user_Name"})})
public class User {
	@Id
	@SequenceGenerator(name = "user_sequence",
	sequenceName = "user_sequenc",
	allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE,
	generator = "user_sequence")
	
	private Long userId;
	@Size(min = 5, max = 20)
	@NotBlank
	private String fName;
	@Size(min=5, max=20)
	@NotBlank
	private String lName;
	@Email
	@NotBlank
	private String email;
	
	@NotBlank
	@Size(min =7,max=20)
	@Column(name="user_name")
	private String userName;
	@Size(min =8,max=100)
	@NotBlank
	private String password;
	@NotBlank
	private String profilePic;
	public Long getId() {
		return userId;
	}
	public void setId(Long id) {
		this.userId = id;
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getProfilePic() {
		return profilePic;
	}
	public void setProfilePic(String profilePic) {
		this.profilePic = profilePic;
	}
	@Override
	public String toString() {
		return "User [id=" + userId + ", fName=" + fName + ", lName=" + lName + ", email=" + email + ", userName="
				+ userName + ", password=" + password + ", profilePic=" + profilePic + "]";
	}
	public User() {
		
	}
	
	
	

}

