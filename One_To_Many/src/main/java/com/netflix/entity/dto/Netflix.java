package com.netflix.entity.dto;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.movies.entity.dto.Movies;

@Entity
public class Netflix {
	@Id
	private int netflixId;
	private  String name;
	private long mob;
	
	@OneToMany(cascade=CascadeType.ALL)
	List<Movies>   movies;

	public int getNetflixId() {
		return netflixId;
	}

	public void setNetflixId(int netflixId) {
		this.netflixId = netflixId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getMob() {
		return mob;
	}

	public void setMob(long mob) {
		this.mob = mob;
	}

	public List<Movies> getMovies() {
		return movies;
	}

	public void setMovies(List<Movies> movies) {
		this.movies = movies;
	}

	@Override
	public String toString() {
		return "Netflix [netflixId=" + netflixId + ", name=" + name + ", mob=" + mob + ", movies=" + movies + "]";
	}
	
	
}
