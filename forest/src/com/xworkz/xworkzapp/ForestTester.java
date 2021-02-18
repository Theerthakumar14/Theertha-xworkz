package com.xworkz.xworkzapp;

import com.xworkz.xworkzapp.dto.ForestDTO;

public class ForestTester {
	public static void main(String[] args) {
		ForestDTO dto = new ForestDTO();
		dto.setForestName("Bandipur");
		dto.setAreaInSqkm("100000sqkm");
		dto.setTypes("Dry");
		System.out.println(dto.getForestName()+" " +dto.getAreaInSqkm()+" "+dto.getTypes());
	

	ForestDTO savanna = new ForestDTO();
	savanna.setForestName("Nagarhole");
	savanna.setAreaInSqkm("200000sqkm");
	savanna.setTypes("Wet");
	System.out.println(savanna.getForestName()+" " +savanna.getAreaInSqkm()+" "+savanna.getTypes());
}
}
