package com.xworkz.xworkzapp.service;

import java.util.function.Predicate;

public class LamdaGKImpl implements LamdaGK<String>{

	@Override
	public boolean TestFIWithSingleParameter(Predicate<String> t) {
		String a = "AAAAAA";
		if(a.length()>3) {
			System.out.println("String is Greater than 3");
			return true;
		}
		else{
			System.out.println("Improper condition");
		}
			return false;
		
	}

}
