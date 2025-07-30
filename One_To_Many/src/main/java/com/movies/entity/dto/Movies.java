package com.movies.entity.dto;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Movies {

	@Id
	private int movieId;
	private String movieName;
	private double ratings;
	
	
	public int getMovieId() {
		return movieId;
	}
	public void setMovieId(int movieId) {
		this.movieId = movieId;
	}
	public String getMovieName() {
		return movieName;
	}
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	public double getRatings() {
		return ratings;
	}
	public void setRatings(double ratings) {
		this.ratings = ratings;
	}
	@Override
	public String toString() {
		return "Movies [movieId=" + movieId + ", movieName=" + movieName + ", ratings=" + ratings + "]";
	}
	
	
}
