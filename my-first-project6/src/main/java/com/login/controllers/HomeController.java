package com.login.controllers;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;

@Controller
public class HomeController{
	@ResponseBody
	@RequestMapping(path="/")
	public ObjectNode RetornarJSON(){
		long stat=Math.round(Math.random());
		if(stat==1) {
			ModelAndView modelAndView = new ModelAndView();
			modelAndView.setStatus(HttpStatus.NOT_FOUND);
		}else {
			ModelAndView modelAndView = new ModelAndView();
			modelAndView.setStatus(HttpStatus.OK);
		}
		ObjectMapper mapper = new ObjectMapper();
		ObjectNode objectNode = mapper.createObjectNode();
		objectNode.put("Stat", stat);
		return objectNode;
	}
}
