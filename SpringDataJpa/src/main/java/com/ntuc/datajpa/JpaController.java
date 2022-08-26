package com.ntuc.datajpa;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JpaController {

	@Autowired
	private CustomerRepository cr;

	@RequestMapping("/view")
	public List<Customers> showCust() {
		cr.findAll().forEach(c -> System.out.println(c));
		return (List<Customers>) cr.findAll();
	}

	@RequestMapping("/add")
	public String addCust() {
		Customers cs = new Customers(302, "James", "SG");
		cr.save(cs);
		return "Inserted";
	}
	
	@RequestMapping("/delete")
	public void delCust() {
		cr.deleteById(301);
		
	}

}
