package com.ntuc.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DiController {
	@Autowired
	@Qualifier("One")
	Propercase pc;
	
	@Autowired
	@Qualifier("Two")
	Propercase pc2;
	
	@RequestMapping("/")
	public String ChangeCase() {
		String s= pc.useCaps("Hello");
		String s1= pc.useSmall("Hello");
		
		String s2=pc2.useCaps(s1);
		String s3 =pc2.useSmall(s2);
		
		System.out.println(s+" "+ s1 +s2+s3);
		return s+" "+ s1;
		
	}
}
