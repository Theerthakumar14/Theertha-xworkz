package com.xworkz.xworkzapp.dto;

public class HighwayDTO {
	private String highwayName;
	private int distance;
	private int noOfTolls;
	
	public HighwayDTO() {
		System.out.println("HighwayDTO object is created");
	}
	public String getHighwayName() {
		return highwayName;
	}
	public void setHighwayName(String name) {
		highwayName = name;
	}
	public int getDistance() {
		return distance ;
	}
	public void setDistance(int dist) {
		distance = dist;
	}
	public int getNoOfTolls() {
		return noOfTolls;
	}
	public void setNoOfTolls(int tolls) {
		noOfTolls = tolls;
	}
	
}
