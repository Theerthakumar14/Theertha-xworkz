package com.xworkz.xworkzapp.service;

import java.util.function.Predicate;

public interface LamdaGK<String>{
	
	boolean TestFIWithSingleParameter(Predicate<String> t);
	
	//boolean testFIWithTwoPara(T a,G b);

}

