package com.bridgelabz.springwebapp.service;

import com.bridgelabz.springwebapp.model.Login;
import com.bridgelabz.springwebapp.model.User;

public interface UserService {

	void register(User user);

	User validateUser(Login login);
}
