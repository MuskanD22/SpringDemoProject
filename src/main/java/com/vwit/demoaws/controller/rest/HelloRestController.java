package com.vwit.demoaws.controller.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/")
public class HelloRestController {
	
	@GetMapping("hello")
	public String getMessage()
	{
		System.out.println("In method");
		return "hello";
	}

}

