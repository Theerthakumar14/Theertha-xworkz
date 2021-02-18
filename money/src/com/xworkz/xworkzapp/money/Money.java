package com.xworkz.xworkzapp.money;

public class Money {
	public String searialNo;
	public String type;
	public static final int NO_OF_LANGUAGES =15;
	
	public Money() {
		// TODO Auto-generated constructor stub
		System.out.println("Money object is created with 0 parameters");
	}
	public Money(String searialNo) {
		this();
		System.out.println("Money object is created with 1 parameters");
		this.searialNo = searialNo;

		
	}
	public Money(String searialNo, String type) {
		this(searialNo);
		System.out.println("Money object is created with 2 parameters");
		this.searialNo = searialNo;
		this.type = type;
		this.spend();
		spend(this.type);
		
		}
	public void spend() {
		System.out.println("Spending on MOM");
	}
	public void spend(String type) {
		System.out.println("Spending on MOM on "+ type);
	}
}
