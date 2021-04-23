package com.xworkz.xworkzapp.dto;

import com.xworkz.xworkzapp.constant.Location;

import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@RequiredArgsConstructor


public class BrandFactoryDTO {
	
	@NonNull
	private Location location;
	@NonNull
	private int noOfBrands;
	@NonNull
	private int NoOfCounters;
	@NonNull
	private boolean open;

}
