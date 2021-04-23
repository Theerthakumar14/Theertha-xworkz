package com.xworkz.xworkzapp.tester;

import com.xworkz.xworkzapp.dto.BrandFactoryDTO;
import com.xworkz.xworkzapp.search.SearchBrand;
import com.xworkz.xworkzapp.service.BrandFactoryService;
import com.xworkz.xworkzapp.service.BrandFactoryServiceImpl;

public class BrandFactoryTester {
	public static void main(String[] args) {
		SearchBrand brand = new SearchBrand() {

			@Override
			public boolean search(BrandFactoryDTO branddto) {
				if (branddto.getNoOfBrands() > 8) {
					return true;
				}
				return false;
			}
		};
		BrandFactoryService service =new BrandFactoryServiceImpl();
		service.genericSearch(brand);
	}

}
