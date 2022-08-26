package com.ntuc.html;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Mycontoller {
	@RequestMapping("/about")
	public String aboutUs() {
		return "about.html";
	
	}
	
	@RequestMapping("/test")
	public String testBs() {
		return "test.html";
	
	}
}
 