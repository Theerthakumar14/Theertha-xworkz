package com.xworkz.xworkzapp;

import com.xworkz.xworkzapp.dto.CityDTO;

public class City {
	
	String cityName;
	
	public static void main(String[] args) {
		System.out.println("started");
		
		CityDTO cityDTO = new CityDTO();
		cityDTO.setCityName("Bengaluru");
		System.out.println(cityDTO.getCityName());
		
		System.out.println("End");
		
	}

}
