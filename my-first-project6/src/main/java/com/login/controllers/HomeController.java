package com.login.controllers;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("/api")
public class HomeController{
	@RequestMapping("/")
	public String index() {
		return "index";
	}
	@RequestMapping("/contact")
	public String contact() {
		return "conctact";
	}
	@RequestMapping("/support")
	public String support() {
		return "support";
	}
}
