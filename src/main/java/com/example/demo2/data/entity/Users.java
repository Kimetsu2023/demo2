package com.example.demo2.data.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;
import lombok.ToString;

@Data
@Entity
@ToString(exclude = "password") // ©“®¶¬‚³‚ê‚étoString‚Épassword‚ğo—Í‚µ‚È‚¢
public class Users {
	@Id
	public String userName;
	public String password;
	public String name;
	public String roleName;
}