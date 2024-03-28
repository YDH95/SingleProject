package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import lombok.extern.log4j.Log4j2;

@Log4j2
@Controller
public class MainController {

	@GetMapping(value = "/")
	public String index() {
		
		log.info("index");
		return "index";
	}
	
	@GetMapping(value = "/user/index")
	public String homepage() {
		
		log.info("index");
		return "index";
	}
	
	
}
