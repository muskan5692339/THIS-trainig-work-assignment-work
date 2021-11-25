package com.shad.SpringMvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {

	@GetMapping("/hello")
	@ResponseBody
	public String sayHello() {
		return "Happy Deepawali.. :)";
	}

	@GetMapping("/")
	public String getIndexPage() {
		return "index";
	}

}
