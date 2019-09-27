package com.bridgelabz.springwebapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.bridgelabz.springwebapp.model.Login;
import com.bridgelabz.springwebapp.model.User;
import com.bridgelabz.springwebapp.service.UserService;

@Controller
public class LoginController {

	@Autowired
	private UserService userService;

	@PostMapping(value = "/loginProcess")
	public ModelAndView loginProcess(@ModelAttribute Login login) {
		ModelAndView mav = null;

		User user = userService.validateUser(login);

		if (user != null) {
			mav = new ModelAndView("welcome");
			mav.addObject("firstName", user.getFirstName());
		} else {
			mav = new ModelAndView("notFound");
			mav.addObject("message", "Username or Password is wrong!!");
		}
		return mav;
	}
}
