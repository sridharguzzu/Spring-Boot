package com.ntuc.di;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("Two")
public class TestClass implements Propercase {

	@Override
	public String useCaps(String s) {
		
		return "Test";
	}

	@Override
	public String useSmall(String s) {
		return "Test";
	}

}
