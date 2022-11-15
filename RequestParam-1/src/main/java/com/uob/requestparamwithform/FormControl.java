package com.uob.requestparamwithform;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class FormControl {
	/*
	 * @RequestMapping("/test") public String testPwd(
	 * 
	 * @RequestParam(value="name")String name,
	 * 
	 * @RequestParam(value="pass") String pass, Model model) {
	 * model.addAttribute("name", name); model.addAttribute("pass", pass); return
	 * "welcome"; }
	 */
	@RequestMapping("/test")
	public String testPwd(
			@RequestParam(value="name")String name,
			@RequestParam(value="pass") String pass,
			Model model) {
		if(pass.equalsIgnoreCase("admin")) {
			String temp = "Hello " + name.toUpperCase();
			model.addAttribute("msg", temp);	
		}
		else {
			String temp = "Please enter a valid password";
			model.addAttribute("msg", temp);
		}
	
		return "welcome";
	}

}
