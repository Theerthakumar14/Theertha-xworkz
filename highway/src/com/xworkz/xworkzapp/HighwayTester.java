package com.xworkz.xworkzapp;

import com.xworkz.xworkzapp.dto.HighwayDTO;

public class HighwayTester {
	
	public static void main(String[] args) {
		HighwayDTO dto = new HighwayDTO();
		dto.setHighwayName("National Highway");
		dto.setDistance(250000);
		dto.setNoOfTolls(30);
		System.out.println(dto.getHighwayName()+" "+dto.getDistance()+" "+dto.getNoOfTolls());
	
	HighwayDTO tpt = new HighwayDTO();
	tpt.setHighwayName("State Highway");
	tpt.setDistance(50000);
	tpt.setNoOfTolls(20);
	System.out.println(tpt.getHighwayName()+" "+tpt.getDistance()+" "+tpt.getNoOfTolls());
}

}
