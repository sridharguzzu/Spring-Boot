package com.ntuc.dynamic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyController {
	@RequestMapping("/list")
	public String showList(Model model) {
		ArrayList<String> al = new ArrayList<>();
		al.add("One");
		al.add("Two");
		al.add("Three");
		al.add("Four");
		al.add("Five");
		model.addAttribute("numbers", al);
		return "list";
	}

	@RequestMapping("/emp")
		public String showEmp(Model model) {
		List<Employees> al = Arrays.asList(
						new Employees("Alex",30,"Admin"),
						new Employees("David",33,"Marketing"),
						new Employees("Aaron",40,"Sales")
						);
		model.addAttribute("emp", al);
		
		return "emp";
	}
}
