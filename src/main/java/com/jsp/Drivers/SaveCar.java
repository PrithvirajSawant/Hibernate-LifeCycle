package com.jsp.Drivers;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jsp.Entities.Car;

public class SaveCar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c = new Car(101, "i8", "BMW", 30000000);
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("simha");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		et.begin();
		em.persist(c);
		c.setPrice(20000000);
		et.commit();
		

	}

}
