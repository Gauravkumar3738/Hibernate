package com.lnt;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Demo {

	public static void main(String[] args) {
		Disk disk=new Disk(100, "Empty Disk");
		AudioDisk audioDisk=new AudioDisk(101, "Pop Music", "Dangerous");
		VideoDisk videoDisk=new VideoDisk(102, "For fans of Salman", "Kick");
		
		EntityManagerFactory  emf=Persistence.createEntityManagerFactory("jpa");
		EntityManager em=emf.createEntityManager();
		em.getTransaction().begin();
		em.persist(disk);
		em.persist(audioDisk);
		em.persist(videoDisk);
		em.getTransaction().commit();
		em.close();
		emf.close();		
		System.out.println("Success..!");
	}
}
