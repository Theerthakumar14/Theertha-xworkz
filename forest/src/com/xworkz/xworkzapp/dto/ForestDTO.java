package com.xworkz.xworkzapp.dto;

public class ForestDTO {
	private String forestName;
	private String areaInSqkm;
	private String types;
	
	public ForestDTO() {
		System.out.println("ForestDTO object is created");
	}
	
	public String getForestName() {
		return forestName;
	}
	public void setForestName(String name) {
		forestName = name;
	}
	public String getAreaInSqkm() {
		return areaInSqkm;
	}
	public void setAreaInSqkm(String sqkm) {
		areaInSqkm = sqkm;
	}
	public String getTypes() {
		return types;
	}
	public void setTypes(String type) {
		types = type;
	}
	
	
}
