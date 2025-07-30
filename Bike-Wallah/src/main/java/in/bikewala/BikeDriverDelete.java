package in.bikewala;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class BikeDriverDelete {
	public static void main(String[] args) {
		 Bike b=new Bike();
		 b.setBid(106);
		 b.setColor("gray");
		 b.setName("FZ");
		 b.setPrice(90000);
		 
		 EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
		 EntityManager em = emf.createEntityManager();
		 EntityTransaction et = em.getTransaction();
		if(b!=null) {
			 et.begin();
			 em.remove(b);
			 et.commit();
		}else{
			System.out.println("Record Not found");
		}
	}
}
