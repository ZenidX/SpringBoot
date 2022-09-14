package com.login.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController{
	@RequestMapping("/")
	public String index() {
		return "index";
	}
	@RequestMapping("/contact")
	public String addPerson() {
		return "contact";
	}
	@RequestMapping("/support")
	public String support(){
		return "support";
	}
}