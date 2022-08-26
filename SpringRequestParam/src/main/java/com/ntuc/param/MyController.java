package com.ntuc.param;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MyController {
	@RequestMapping("/")
	public String showParam(Model m,@RequestParam String p, @RequestParam(required=false, defaultValue="18") Integer age) {
		String s = p.toUpperCase() + " "+ age;
		m.addAttribute("p", s);

		return "welcome";
	}
}
