package com.xworkz.xworkzapp;

import com.xworkz.xworkzapp.money.Money;

public class MoneyUtil {
	public static void main(String[] args) {
		
		Money money =new Money("2EL12345","note");
		System.out.println(money.searialNo+" "+money.type);
	}
}
