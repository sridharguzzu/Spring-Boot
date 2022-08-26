package com.ntuc.datajpa;


import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class JpaController {

	@Autowired
	private CustomerRepository cr;

	@RequestMapping("/")
	public String showCust(Model m) {
		m.addAttribute("customer", cr.findAll());
		return "customers";
	}

	@RequestMapping("/getOne")
	@ResponseBody
	public Optional<Customers> showOne(Integer id){
		System.out.println("am here");
		return cr.findById(id);
	}
	
	
	@RequestMapping("/add")
	public String addCust(@RequestParam Integer cid, @RequestParam String cname, @RequestParam String loc) {
		Customers cs = new Customers(cid, cname, loc);
		cr.save(cs);
		return "redirect:/";
	
	}


	@RequestMapping(value= "/delete/{id}")
	public String delCust(@PathVariable("id") int cid) {
		cr.deleteById(cid);
		return "redirect:/";

	}

}
