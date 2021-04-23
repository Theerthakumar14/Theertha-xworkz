package com.xworkz.xworkzapp.tester;

import com.xworkz.xworkzapp.constant.Location;
import com.xworkz.xworkzapp.dto.BrandFactoryDTO;
import com.xworkz.xworkzapp.service.BrandFactoryService;
import com.xworkz.xworkzapp.service.BrandFactoryServiceImpl;

public class LamdaTester {
	public static void main(String[] args) {
		BrandFactoryService ser = new BrandFactoryServiceImpl();
//		ser.genericSearch((brand)->{
//			return brand.getLocation().equals(Location.BANNERGATTA);
//		});
		ser.genericSearch((brand)->{
			return brand.getNoOfBrands()>10 && brand.getNoOfCounters()>10;
		});
	}
}
