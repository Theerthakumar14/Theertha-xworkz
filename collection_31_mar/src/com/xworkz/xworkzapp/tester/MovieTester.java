package com.xworkz.xworkzapp.tester;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import com.xworkz.xworkzapp.dao.MovieDao;
import com.xworkz.xworkzapp.dao.MovieDaoImpl;

public class MovieTester {

	public static void main(String[] args) {

		MovieDao dao = new MovieDaoImpl();
		dao.addMOvieDetails("Robert");
		dao.addMOvieDetails("Pogaru");
		dao.addMOvieDetails("Sarathi");
		dao.addMOvieDetails("Adduri");
		dao.addMOvieDetails("om");
		dao.addMOvieDetails(null);
		// dao.addMOvieDetails("Pogaru");
		// dao.addMOvieDetails(null);

		// dao.dao.display();

		Set movieNames = dao.getMovieNames();
		Iterator iterator = movieNames.iterator();
		while (iterator.hasNext()) {
			String movie = (String) iterator.next();
			System.out.println(movie);
		}
	}

}
