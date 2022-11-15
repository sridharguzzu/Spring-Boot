package com.uob.requestparam;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class FormController {
	@RequestMapping("/info")
	public String showParam(
			@RequestParam(value="name") String name, 
			@RequestParam(value="pass", required=false, defaultValue="pass") String pass,
			Model model){
				model.addAttribute("name", name);
				model.addAttribute("pwd", pass);
				return "welcome";
	}

}
