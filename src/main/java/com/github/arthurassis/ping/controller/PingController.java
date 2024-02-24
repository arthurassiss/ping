package com.github.arthurassis.ping.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class PingController {
	
	@GetMapping("/ping")
	public String ping() {
		return "Jesus ta vivão";
	}
	
	@GetMapping("/name")
	public String name() {
		return "Arthur de Assis";
	}
	
	
	

}
