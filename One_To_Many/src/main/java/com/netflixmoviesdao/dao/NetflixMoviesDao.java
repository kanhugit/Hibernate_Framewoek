package com.netflixmoviesdao.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.movies.entity.dto.Movies;
import com.netflix.entity.dto.Netflix;

public class NetflixMoviesDao {
	public EntityManager getEntityManager() {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("dev");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		return entityManager;

	}

	public void saveNetFlixUser(Netflix netflix) {
		EntityManager entityManager = getEntityManager();
		EntityTransaction entityTransction = entityManager.getTransaction();
		entityTransction.begin();
		entityManager.persist(netflix);
		entityTransction.commit();
	}
	
	
	public void addMoviesToUser(int netflixId,List<Movies> movoies) {
		EntityManager entityManager = getEntityManager();
		EntityTransaction entityTransction = entityManager.getTransaction();
		
		Netflix netflix=entityManager.find(Netflix.class, netflixId);
		
		if(netflix !=null) {
			List<Movies> listMoviesDb=netflix.getMovies();
		}
	}
	
	
	
	
	
	

//	public void updateNetflixMovies(List<Movies> moviesList) {
//		EntityManager entityManager = getEntityManager();
//		EntityTransaction entityTransaction = entityManager.getTransaction();
//
//		entityTransaction.begin();
//		for (Movies movie : moviesList) {
//			entityManager.merge(movie); // Update each movie
//
//			entityTransaction.commit();
//
//		}

//	}
}
