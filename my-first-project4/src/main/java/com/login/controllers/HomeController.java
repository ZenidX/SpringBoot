package com.login.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;

@Controller
public class HomeController{
	@ResponseBody
	@RequestMapping("/")
	public ObjectNode index(){
		ObjectMapper mapper = new ObjectMapper();
		ObjectNode objectNode = mapper.createObjectNode();
		objectNode.put("key","value");
		objectNode.put("foo", "bar");
		objectNode.put("number",42);
		return objectNode;
	}
}
