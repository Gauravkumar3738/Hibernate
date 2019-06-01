package Hibernate1.Hibernate1;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import java.util.Date;

/**
 * Hello world!
 *
 */
public class App 

{
	static User userobj;
	static Session sessionobj;
	static SessionFactory sessionFactoryobj;

	private static SessionFactory buildSessionFactory(){


		// creating configuration Instance & passing Hibernate 
		
		Configuration configobj=new Configuration();
		configobj.configure("hibernate.cfg.xml");

		// since Hibernate version 4.x service registry is being

		ServiceRegistry serviceRegistryObj=new StandardServiceRegistryBuilder().applySettings(configobj.getProperties()).build();

		// creating Hibernate SessionFactory Instance
		sessionFactoryobj=configobj.buildSessionFactory(serviceRegistryObj);

		return sessionFactoryobj;
	}
	public static void main( String[] args )
	{
		try{
			System.out.println( " ....Hibernate Maven Example" );

		
			//case 1 : For Save


			sessionobj=buildSessionFactory().openSession();
			sessionobj.beginTransaction();
      /*
		    userobj=new User();
		 	userobj.setUserid(102);
			userobj.setUsername("Ramesh");
			userobj.setCreatedBy("Admininstrator");
		    sessionobj.save(userobj);
		*/	
			Date d1=new Date();
			
			User user1 = new User();
			user1.setUserid(103);
			user1.setUsername("Jogesh");
			user1.setCreatedBy("Devloper");
			user1.setCreatedDate("31/01/2019");
			sessionobj.save(user1);
			
			User user2=new User();
			user2.setUserid(105);
			user2.setUsername("Ramcharan");
			user2.setCreatedBy("Tester");
			user2.setCreatedDate("23/06/2020");
			sessionobj.save(user2);
			
			User user3=new User();
			user3.setUserid(207);
			user3.setUsername("Somesh");
			user3.setCreatedBy("Hr");
			user3.setCreatedDate("22/01/2018");
			sessionobj.save(user3);
		   
		
			User user4= new User();
			user4.setUserid(108);
			user4.setUsername("Raj");
			user4.setCreatedBy("Dotnet");
			user4.setCreatedDate("31/01/1995");
			sessionobj.save(user4);
		
			User user5=new User();
			user5.setUserid(707);
			user5.setUsername("Vimesh");
			user5.setCreatedBy("Doctor");
			user5.setCreatedDate("27/06/2017");
			sessionobj.save(user5);
			
			
			
	     	sessionobj.delete(user4);
			
			
			//sessionobj.close();
			
			System.out.println("Records save succesfully");
			
		   // sessionobj.close();
		  // ssessionobj.delete(user4);
			
		  // System.out.println("Record delete successfully");
			
		  // committing the transaction to the database
		 //	sessionobj.getTransaction().commit();
		}catch (Exception e) {
			System.out.println(e);
		}
		
		// case 2 : For delete
		
		//sessionobj=buildSessionFactory().openSession();
		//sessionobj.beginTransaction();
	
	}
	
	
	
	
}