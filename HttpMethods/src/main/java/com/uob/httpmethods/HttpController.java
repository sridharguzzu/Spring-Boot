package com.uob.httpmethods;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
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
	public String getMr() {
		return "get from RM";
	}

	@RequestMapping(value = "/post", method = RequestMethod.POST)
	public String getPo() {
		return "Post from RM";
	}

	@RequestMapping(value = "/put", method = RequestMethod.PUT)
	public String getPu() {
		return "Put from RM";
	}

	@RequestMapping(value = "/delete", method = RequestMethod.DELETE)
	public String getd() {
		return "Delete from RM";
	}
}
