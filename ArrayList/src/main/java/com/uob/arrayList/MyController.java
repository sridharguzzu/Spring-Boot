package com.uob.arrayList;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyController {

	@RequestMapping("/list")
	public String showlist(Model model) {
		ArrayList<String> names = new ArrayList<>();
		names.add("David");
		names.add("James");
		names.add("Bill");
		names.add("Steve");
		names.add("Jim");
		model.addAttribute("nameslist", names);
		return "list";
	}

	@RequestMapping("/")  
	public String showhome() {
		return "index";
	}
	
	@RequestMapping("/emp")
	public String showEmp(Model model) {
		ArrayList<Employees> emplist = new ArrayList<Employees>();
		emplist.add(new Employees(100, "David", 5504));
		emplist.add(new Employees(100, "Alex", 5504));
		emplist.add(new Employees(100, "Dave", 5504));
		emplist.add(new Employees(100, "John", 5504));
		model.addAttribute("employees", emplist);
		return "emp";
	}
	

	
}
