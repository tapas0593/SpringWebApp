package com.bridgelabz.springwebapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bridgelabz.springwebapp.dao.UserDAO;
import com.bridgelabz.springwebapp.model.Login;
import com.bridgelabz.springwebapp.model.User;

@Service("userService")
public class UserServiceImpl implements UserService {
	@Autowired
	UserDAO userDAO;

	@Transactional
	public void register(User user) {
		userDAO.register(user);
	}

	@Transactional
	public User validateUser(Login login) {
		return userDAO.validateUser(login);
	}

}
