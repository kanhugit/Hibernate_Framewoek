package in.bikewala;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class BikeDriver {
	public static void main(String[] args) {
		Bike b=new Bike();
		b.setBid(101);
		b.setColor("Black");
		b.setName("Hero");
		b.setPrice(85000);
		
		b.setBid(102);
		b.setColor("Yellow");
		b.setName("KTM");
		b.setPrice(2000000);
		
		b.setBid(103);
		b.setColor("White");
		b.setName("Pulser");
		b.setPrice(500000);
		
		b.setBid(104);
		b.setColor("Red");
		b.setName("Pulser");
		b.setPrice(700000);
		
		b.setBid(105);
		b.setColor("Green");
		b.setName("Pulser");
		b.setPrice(700000);
	
		
	
		
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		//save
		et.begin();
		em.persist(b);
		et.commit();
	}
}
