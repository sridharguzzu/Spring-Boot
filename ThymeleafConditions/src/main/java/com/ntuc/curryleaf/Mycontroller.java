package com.ntuc.curryleaf;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Mycontroller {
	@RequestMapping("/data")
	public String showData(Model model, @RequestParam Integer age) {
		model.addAttribute("age", age);
		return "test";
	}
}
