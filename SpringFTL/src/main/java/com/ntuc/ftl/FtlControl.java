package com.ntuc.ftl;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FtlControl {
	@RequestMapping("/data")
	public String sayHello(Model model) {
		String name = "David";
		model.addAttribute("name", name);
		return "welcome";
		
	}
}
