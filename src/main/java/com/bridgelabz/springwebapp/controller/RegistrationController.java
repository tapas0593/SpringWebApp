package com.bridgelabz.springwebapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.bridgelabz.springwebapp.model.User;
import com.bridgelabz.springwebapp.service.UserService;

@Controller
public class RegistrationController {
	@Autowired
	public UserService userService;

	@PostMapping(value = "/registerProcess")
	public ModelAndView addUser(@ModelAttribute User user) {
		userService.register(user);
		return new ModelAndView("registrationSuccess", "message", "You are Successfully Registered");
	}
}
