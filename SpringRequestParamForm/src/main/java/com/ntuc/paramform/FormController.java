package com.ntuc.paramform;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class FormController {
	@RequestMapping("/data")
	public String showData(Model m,@RequestParam String name) {
		m.addAttribute("name", name);
		return "name";
	}
}
