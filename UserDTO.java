package com.cg.osa.dto;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
@Entity
@Table(name="user_table")
public class UserDTO {
	@Id
	@NotNull (message="sorry id cannot be null")
	int userId;
	@Column(name="password")
    @NotBlank(message="sorry password should not be blank")
    @Max(value=20,message="sorry maximum characters are 20")
	String password;
	@Column(name="role")
	@NotBlank(message="sorry password should not be blank")
	 @Max(value=30,message="sorry maximum characters are 30")
	String role;
	public UserDTO(int userId, String password, String role) {
		super();
		this.userId = userId;
		this.password = password;
		this.role = role;
	}
	public UserDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	@Override
	public String toString() {
		return "User [userId=" + userId + ", password=" + password + ", role=" + role + "]";
	}
	

}
