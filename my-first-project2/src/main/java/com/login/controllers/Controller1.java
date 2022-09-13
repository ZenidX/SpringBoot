package com.login.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Controller1{
	@GetMapping("/1")
	public ModelAndView test() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("test1.html");
		modelAndView.setStatus(HttpStatus.I_AM_A_TEAPOT);
		return modelAndView;
	}
}
/*
@Controller
public class HomeController{
	@ResponseBody
	@RequestMapping("/")
	public String index() {
		return "index.html";
	}
}

@ResponseBody
@Controller
public class HomeController{
	@RequestMapping("/")
	public String index(){
		return "index.html";
	}
}
*/