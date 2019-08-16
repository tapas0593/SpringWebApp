package com.bridgelabz.springwebapp.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class User {
	private String userName;
	private String password;
	private String firstName;
	private String lastName;
	private String email;
	private String address;
	private long phone;
}
