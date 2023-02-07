package com.kh.spring13.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/as")
public class HomeController {
	
	@RequestMapping("/hi")
	@ResponseBody
	public String home() {
		return "welcccc";
	}
}
