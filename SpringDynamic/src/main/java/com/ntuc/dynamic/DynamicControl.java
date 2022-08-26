package com.ntuc.dynamic;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DynamicControl {
	@RequestMapping("/")
	public String showData(Model m) {
		m.addAttribute("name", "Simon");
		return "Hello";
	}
	
	@RequestMapping("/sales")
	public String showData1(Model m) {
		m.addAttribute("name", "Sridhar");
		return "Hello";
	}
}
