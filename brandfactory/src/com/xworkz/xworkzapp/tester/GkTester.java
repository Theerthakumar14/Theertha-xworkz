package com.xworkz.xworkzapp.tester;

import com.xworkz.xworkzapp.service.LamdaGK;
import com.xworkz.xworkzapp.service.LamdaGKImpl;

public class GkTester {
	public static void main(String[] args) {
           LamdaGK l=new LamdaGKImpl();
           
           l.TestFIWithSingleParameter((e)->((String) e).contains("A"));		
	}




}
