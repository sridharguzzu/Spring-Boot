package com.ntuc.datah2;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class BankTxn {
	
	@RequestMapping("/withdraw")
	public String withdrawAmt(@RequestParam float amt ) {
		System.out.println(amt + " withdrawn");
		return "success";
	}
	
	@RequestMapping("/")
	public String showForm() {
		return "withdraw";
	}
	
	@RequestMapping("/success")
	public String showSuccess() {
		return "success";
	}
	@RequestMapping("/reject")
	public String showReject() {
		return "reject";
	}
}
