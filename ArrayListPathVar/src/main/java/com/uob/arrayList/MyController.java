package com.uob.arrayList;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyController {
	 static ArrayList<String> names;

	@RequestMapping("/")
	public String showlist(Model model) {
		names = new ArrayList<>();
		names.add("David");
		names.add("James");
		names.add("Bill");
		names.add("Steve");
		names.add("Jim");
		model.addAttribute("nameslist", names);
		return "index";
	}

	@GetMapping("/delete/{name}")
	public String delName(@PathVariable("name") String name, Model model) {
		names.remove(name);
		model.addAttribute("nameslist", names);
		System.out.println(names.size());
		return "index";
	}

}
