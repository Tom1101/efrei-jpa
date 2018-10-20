package com.univ;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.sun.org.apache.bcel.internal.generic.POP2;
import com.univ.Person;

/**
 * Hello world!
 *
 */
public class Main 
{
    public static void main( String[] args )
    {
    	EntityManagerFactory emf = Persistence.createEntityManagerFactory("manager1");
		EntityManager entityManager = emf.createEntityManager();
		
		EntityTransaction tx = entityManager.getTransaction();
		
    	try{
    		
			tx.begin();
			
			Person p1 = new Person();
			p1.setName("Tintin");
			entityManager.persist(p1);

			Person p2 = new Person();
			p2.setName("TomTom");
			entityManager.persist(p2);

			Vehicule v1 = new Car();
			v1.setPlateNumber(123);
			((Car) v1).setNumberOfSeats(4);
			Vehicule v2 = new Van();
			v2.setPlateNumber(456);
			((Van) v2).setMaxWeight(100);

			entityManager.persist(v1);
			entityManager.persist(v2);
			DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
			Date beginDate = dateFormat.parse("23/09/2017");
			Date endDate = dateFormat.parse("23/10/2017");

			Rent r1 = new Rent();
			r1.setBeginRent(beginDate);
			r1.setEndRent(endDate);
			r1.setPerson(p2);
			r1.setVehicule(v1);
			entityManager.persist(r1);

			Rent r2 = new Rent();
			r2.setBeginRent(beginDate);
			r2.setEndRent(endDate);
			r2.setPerson(p1);
			r2.setVehicule(v2);
			entityManager.persist(r2);
				
			tx.commit();			
		
		}catch(Exception e){
			e.printStackTrace();
			tx.rollback();
		}
		
	}
}
