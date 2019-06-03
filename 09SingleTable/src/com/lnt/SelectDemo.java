package com.lnt;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class SelectDemo {


	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		EntityManagerFactory  emf=Persistence.createEntityManagerFactory("jpa");
		EntityManager em=emf.createEntityManager();
		em.getTransaction().begin();
		Query query=em.createQuery("from Disk");//polymorphic query
		List<Disk> disks=query.getResultList();
		for(Disk disk:disks){
			if(disk instanceof AudioDisk){
				AudioDisk audioDisk=(AudioDisk)disk;
				System.out.println(audioDisk.getDiskId()+" "+audioDisk.getDescription()+" "+audioDisk.getAlbumName());
			}else if(disk instanceof VideoDisk){
				VideoDisk videoDisk=(VideoDisk)disk;
				System.out.println(videoDisk.getDiskId()+" "+videoDisk.getDescription()+" "+videoDisk.getMovieName());
			}else{
				System.out.println(disk.getDiskId()+" "+disk.getDescription());
			}
		}
		
		em.getTransaction().commit();
		em.close();
		emf.close();
		
		System.out.println("Success..!");
	}

}
