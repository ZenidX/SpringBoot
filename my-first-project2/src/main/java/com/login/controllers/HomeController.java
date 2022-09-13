package com.login.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.login.pojos.TextToJSON;

@Controller
public class HomeController{
	@ResponseBody
	@RequestMapping(path="/")
	public TextToJSON test(){
		return new TextToJSON("index.html");
	}
}
