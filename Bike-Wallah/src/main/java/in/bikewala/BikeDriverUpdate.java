package in.bikewala;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class BikeDriverUpdate {
	public static void main(String[] args) {
		 Bike b=new Bike();
		 b.setBid(106);
		 b.setColor("gray");
		 b.setName("FZ");
		 b.setPrice(90000);
		 
		 EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
		 EntityManager em = emf.createEntityManager();
		 EntityTransaction et = em.getTransaction();
		 et.begin();
		 //update
		 em.merge(b);
		 et.commit();
		 
	}
}
