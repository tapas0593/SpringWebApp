package com.bridgelabz.springwebapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.bridgelabz.springwebapp.model.User;
import com.bridgelabz.springwebapp.service.UserService;

@Controller
public class RegistrationController {
	@Autowired
	public UserService userService;

	@RequestMapping(value = "/register")
	public ModelAndView showRegister() {
		return new ModelAndView("register", "user", new User());
	}

	@RequestMapping(value = "/registerProcess", method = RequestMethod.POST)
	public ModelAndView addUser(@ModelAttribute("user") User user) {
		userService.register(user);
		return new ModelAndView("registrationSuccess", "message", "You are Successfully Registered");

	}

}
