package com.naver.myhome.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	// http://localhost:8088/hello
	@GetMapping("/hello")
	public String hello() {
		return "hello Spring~ L3";
	}
}
