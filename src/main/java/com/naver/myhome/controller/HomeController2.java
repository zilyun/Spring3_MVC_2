package com.naver.myhome.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController2 {
	
	@GetMapping("/index")
	public String hello1() { 
		// 스프링은 기본 방식이 forwarding 방식
		return "NewFile3";
	}
	
	@GetMapping("/index2")
	public String hello2() {
		return "NewFile4";
	}
	
	@GetMapping("/index3")
	public String hello3() {
		return "NewFile5";
	}
	
}
