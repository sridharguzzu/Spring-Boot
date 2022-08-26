package com.ntuc.addrec;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MyController {
	
	ArrayList<String> al = new ArrayList<>();
	
	@RequestMapping("/")
	public String addStr(Model m,@RequestParam(required=false) String name) {
			al.add(name);
			
			System.out.println(al);
			m.addAttribute("names", al);
			return "info";
	}
}
