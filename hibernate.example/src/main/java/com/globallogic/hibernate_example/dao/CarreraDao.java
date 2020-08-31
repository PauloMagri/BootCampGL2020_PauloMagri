package com.globallogic.hibernate_example.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.globallogic.hibernate_example.config.HibernateConfig;
import com.globallogic.hibernate_example.entity.Carrera;

public class CarreraDao {
	
	public void createCarrera(Carrera carrera) {
    	Transaction transaction = null;
    	try (Session session = HibernateConfig.getSessionFactory().openSession()) {
   		 transaction = session.beginTransaction();
        	session.save(carrera);
        	transaction.commit();
    	} catch (Exception e) {
        	if (transaction != null) {
            	transaction.rollback();
        	}
        	e.printStackTrace();
    	}
	}
	
	public List <Carrera> getCarreras() {
    	try (Session session = HibernateConfig.getSessionFactory().openSession()) {
        	return session.createQuery("from Carrera", Carrera.class).list();
    	}
	}
	
	public Carrera getCarreraById(long id) {
	   	 try (Session session = HibernateConfig.getSessionFactory().openSession()) {
	   		List<Carrera> carreras = session.createQuery("from Carrera c where c.id=:id", 
	   				Carrera.class).setParameter("id", id).list();
	   	 return carreras.get(0);	
	   	 }
	}

	public void updateCarrera(Carrera carrera) {
	   	 Transaction transaction = null;
	    	try (Session session = HibernateConfig.getSessionFactory().openSession()) {
	   		 transaction = session.beginTransaction();
	        	session.update(carrera);
	        	transaction.commit();
	    	} catch (Exception e) {
	        	if (transaction != null)
	            	  transaction.rollback();
	        	e.printStackTrace();
	    	}
	}
	
	public void removeCarrera(Carrera carrera) {
	   	 Transaction transaction = null;
	    	try (Session session = HibernateConfig.getSessionFactory().openSession()) {
	   		 transaction = session.beginTransaction();
	        	session.delete(carrera);
	        	transaction.commit();
	    	} catch (Exception e) {
	        	if (transaction != null)
	            	  transaction.rollback();
	        	e.printStackTrace();
	    	}
	}

}
