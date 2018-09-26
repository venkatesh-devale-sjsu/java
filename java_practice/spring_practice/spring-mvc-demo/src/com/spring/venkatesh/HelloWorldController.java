package com.spring.venkatesh;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWorldController {
	
	@RequestMapping("/showForm")
	public String showForm() {
		return "hello-world-form";
	}
	
	@RequestMapping("/processForm")
	public String processForm() {
		return "show-studentname-form";
	}
}