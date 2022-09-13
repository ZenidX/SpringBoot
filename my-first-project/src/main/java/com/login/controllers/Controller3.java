package com.login.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Controller3{
	@GetMapping("/3")
	public ModelAndView test() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("test3.html");
		modelAndView.setStatus(HttpStatus.I_AM_A_TEAPOT);
		return modelAndView;
	}
}