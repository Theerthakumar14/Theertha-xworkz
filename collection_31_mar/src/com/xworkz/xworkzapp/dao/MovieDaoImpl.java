package com.xworkz.xworkzapp.dao;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class MovieDaoImpl implements MovieDao{
	Set<String> movie = new HashSet<String>();

	@Override
	public void addMOvieDetails(String name) {
		movie.add(name);
		System.out.println("Added successfully******!");
	}

	@Override
	public void display() {
		System.out.println(movie);
		System.out.println("size of movie is "+ movie.size());
		
	}

	@Override
	public Set<String> getMovieNames() {
		return movie;
	}

}
