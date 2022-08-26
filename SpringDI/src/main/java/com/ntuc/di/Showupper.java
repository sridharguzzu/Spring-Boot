package com.ntuc.di;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
 
@Component
@Scope("prototype") 
@Qualifier("One")
// the default scope is singleton
public class Showupper implements Propercase{

	@Override
	public String useCaps(String s) {
		return s.toUpperCase();
	}

	@Override
	public String useSmall(String s) {
		return s.toLowerCase();
	}

}
