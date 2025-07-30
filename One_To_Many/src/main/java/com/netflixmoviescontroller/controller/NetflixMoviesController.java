package com.netflixmoviescontroller.controller;

import java.util.ArrayList;
import java.util.List;

import com.movies.entity.dto.Movies;
import com.netflix.entity.dto.Netflix;
import com.netflixmoviesdao.dao.NetflixMoviesDao;

public class NetflixMoviesController {
	public static void main(String[] args) {

		Movies movie1 = new Movies();
		movie1.setMovieId(1001);
		movie1.setMovieName("Sallar");
		movie1.setRatings(8.0);

		Movies movie2 = new Movies();
		movie2.setMovieId(1002);
		movie2.setMovieName("RRR");
		movie2.setRatings(8.5);

		Movies movie3 = new Movies();
		movie3.setMovieId(1003);
		movie3.setMovieName("Devara");
		movie3.setRatings(9.0);

//		Movies movie4 = new Movies();
//		movie4.setMovieId(1003);
//		movie4.setMovieName("Bahubali");
//		movie4.setRatings(7.0);

		List<Movies> listMovies = new ArrayList<Movies>();
		listMovies.add(movie1);
		listMovies.add(movie2);
		listMovies.add(movie3);
//		listMovies.add(movie4);

		Netflix netflix = new Netflix();
		netflix.setNetflixId(101);
		netflix.setName("Kanha kumar");
		netflix.setMob(8112146097L);

		netflix.setMovies(listMovies);
		NetflixMoviesDao dao = new NetflixMoviesDao();
//		dao.saveNetFlixUser(netflix);  
//		dao.updateNetflixMovies(listMovies);
	}
}
