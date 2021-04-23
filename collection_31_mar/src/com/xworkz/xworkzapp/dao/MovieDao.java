package com.xworkz.xworkzapp.dao;

import java.util.Set;

public interface MovieDao {
	
	public void addMOvieDetails(String name);
	
	public void display();
	
	public Set<String> getMovieNames();

}
