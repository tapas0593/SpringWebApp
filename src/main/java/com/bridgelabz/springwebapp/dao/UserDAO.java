package com.bridgelabz.springwebapp.dao;

import com.bridgelabz.springwebapp.model.Login;
import com.bridgelabz.springwebapp.model.User;

public interface UserDAO {
		void register(User user);

		User validateUser(Login login);
}
