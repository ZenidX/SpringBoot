package com.login.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Controller2{
	@GetMapping("/2")
	public ModelAndView test() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("test2.html");
		modelAndView.setStatus(HttpStatus.I_AM_A_TEAPOT);
		return modelAndView;
	}
}
