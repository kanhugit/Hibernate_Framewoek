package in.bikewala;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class FetchAllRecords {
	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
		 EntityManager em = emf.createEntityManager();
		 Query q = em.createQuery("select b from Bike b");
		 List<Bike> b = q.getResultList();
		 System.out.println(b);
		 
		 //using For-each 
		 
//		 for (Bike bike : b) {
//			    System.out.println("Bike ID: " + bike.getBid());
//			    System.out.println("Bike Model: " + bike.getColor());
//			    System.out.println("Bike Price: " + bike.getName());
//			    System.out.println("Bike Price: " + bike.getPrice());
//			    System.out.println("------------------------");
//			}
		 
		 
		 
		 //using java Stream
//		 b.forEach(bike -> {
//			    System.out.println("Bike ID: " + bike.getBid());
//         System.out.println("Bike Color: " + bike.getColor());
//         System.out.println("Bike Name: " + bike.getName());
//         System.out.println("Bike Price: " + bike.getPrice());
//         System.out.println("------------------------");
//			});
		 
		 
		// Using ListIterator
//	        ListIterator<Bike> iterator = b.listIterator();
//	        while (iterator.hasNext()) {
//	            Bike bike = iterator.next();
//	            System.out.println("Bike ID: " + bike.getBid());
//	            System.out.println("Bike Color: " + bike.getColor());
//	            System.out.println("Bike Name: " + bike.getName());
//	            System.out.println("Bike Price: " + bike.getPrice());
//	            System.out.println("------------------------");
//	        }
		 
		 //single record fetch
		 em.createQuery("select b from Bike b where b.bid=?1");
		 q.setParameter(1, 101);
		 Bike b1 = (Bike) q.getSingleResult();
		 System.out.println(b1);

	}
}
