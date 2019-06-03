package com.lnt;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceUnit;


public class Demo {

	public static void main(String[] args) {
		Employee employee=new Employee(123, "Jagadeesh", 123456);
		Address address=new Address(100, "Mumbai", "India");
		employee.setAddress(address);
		
		
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("jpa1");
		EntityManager em=emf.createEntityManager();
		em.getTransaction().begin();
		em.persist(employee);
		//em.persist(address);
		em.getTransaction().commit();
		em.close();
		emf.close();
		System.out.println("Success..!");
	}

}