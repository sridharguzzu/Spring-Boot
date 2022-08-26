package com.ntuc.crud;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class EmpControl {

	
	@RequestMapping("/add")
	String addRecords() {
		return "addform";
	}
	
	@RequestMapping("/insert")
	String insertRec(@RequestParam Integer id, @RequestParam String name, @RequestParam String dept,@RequestParam double sal) {
		Employees emp = new Employees(name,id,dept,sal);
		System.out.println(emp.toString());
		return "addform";
		
	}
}
