package com.xworkz.xworkzapp.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;

import com.xworkz.xworkzapp.constant.Location;
import com.xworkz.xworkzapp.dto.BrandFactoryDTO;
import com.xworkz.xworkzapp.search.SearchBrand;

public class BrandFactoryServiceImpl implements BrandFactoryService{
	List<BrandFactoryDTO> list = new ArrayList<BrandFactoryDTO>();
	
	 public BrandFactoryServiceImpl() {
		 BrandFactoryDTO brand = new BrandFactoryDTO(Location.BANNERGATTA, 20, 05, true);
		 BrandFactoryDTO brand1 = new BrandFactoryDTO(Location.JALAHALLICROSS, 25, 8, false);
		 BrandFactoryDTO brand2= new BrandFactoryDTO(Location.MARATHALLI, 5, 9, true);
		 BrandFactoryDTO brand3 = new BrandFactoryDTO(Location.MALLESHWARAM, 8, 6, true);
		 list.add(brand);
		 list.add(brand1);
		 list.add(brand2);
		 list.add(brand3);

	}
	 
	 
	//@Override
//	public void genericSearch(SearchBrand brand) {
//		Iterator<BrandFactoryDTO> itr = list.iterator();
//		while(itr.hasNext()) {
//			BrandFactoryDTO next = itr.next();
//			if(brand.search(next)) {
//				System.out.println("dto is matching"+ list);
//			}else {
//				System.out.println("dto is not matching");
//					
//				}
//		}
//	}


	@Override
	public void genericSearch(Predicate<BrandFactoryDTO> predicate) {
		// TODO Auto-generated method stub
		Iterator<BrandFactoryDTO> iterator = list.iterator();
		while (iterator.hasNext()) {
			BrandFactoryDTO brandFactoryDTO = (BrandFactoryDTO) iterator.next();
			if(predicate.test(brandFactoryDTO)) {
				System.out.println("dto is found" + list);
			}else {
				System.out.println("dto is not found");
			}
			
		}
		
	}

}



