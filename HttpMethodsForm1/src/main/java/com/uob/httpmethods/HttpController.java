package com.uob.httpmethods;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class HttpController {

	/*
	 * @GetMapping("/get") // -> IDEMPOTENT Method public String getM() { return
	 * "get"; }
	 * 
	 * @PostMapping("/post") public String getPo() { return "Post"; }
	 * 
	 * @PutMapping("/put") public String getPu() { return "Put"; }
	 * 
	 * @DeleteMapping("/delete") public String getd() { return "Delete"; }
	 */
	// @Shortcuts in Spring

	@RequestMapping(value = "/get", method = RequestMethod.GET)
	public String getMr(Model model) {
		model.addAttribute("msg", "get");
		return "index";
	}

	@RequestMapping(value = "/post", method = RequestMethod.POST)
	public String getPo(Model model) {
		model.addAttribute("msg", "post");
		return "index";
	}

	@RequestMapping(value = "/put", method = RequestMethod.PUT)
	public String getPu(Model model) {
		model.addAttribute("msg", "put");
		return "index";
	}

	@RequestMapping(value = "/delete", method = RequestMethod.DELETE)
	public String getd(Model model) {
		model.addAttribute("msg", "delete");
		return "index";
	}

}
