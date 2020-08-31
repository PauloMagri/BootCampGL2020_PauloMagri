package com.globallogic.hibernate_example.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.globallogic.hibernate_example.config.HibernateConfig;
import com.globallogic.hibernate_example.entity.Competidor;

public class CompetidorDao {
	
	public void createCompetidor(Competidor competidor) {
    	Transaction transaction = null;
    	try (Session session = HibernateConfig.getSessionFactory().openSession()) {
   		 transaction = session.beginTransaction();
        	session.save(competidor);
        	transaction.commit();
    	} catch (Exception e) {
        	if (transaction != null) {
            	transaction.rollback();
        	}
        	e.printStackTrace();
    	}
	}
	
	public List <Competidor> getCompetidores() {
    	try (Session session = HibernateConfig.getSessionFactory().openSession()) {
        	return session.createQuery("from Competidor", Competidor.class).list();
    	}
	}
	
	public Competidor getCompetidorById(long id) {
	   	 try (Session session = HibernateConfig.getSessionFactory().openSession()) {
	   		List<Competidor> competidores = session.createQuery("from Competidor c where c.numero=:id", 
	   				 						Competidor.class).setParameter("id", id).list();
	   	 return competidores.get(0);	
	   	 }
	}

	public void updateCompetidor(Competidor competidor) {
	   	 Transaction transaction = null;
	    	try (Session session = HibernateConfig.getSessionFactory().openSession()) {
	   		 transaction = session.beginTransaction();
	        	session.update(competidor);
	        	transaction.commit();
	    	} catch (Exception e) {
	        	if (transaction != null)
	            	  transaction.rollback();
	        	e.printStackTrace();
	    	}
	}
	
	public void removeCompetidor(Competidor competidor) {
	   	 Transaction transaction = null;
	    	try (Session session = HibernateConfig.getSessionFactory().openSession()) {
	   		 transaction = session.beginTransaction();
	        	session.delete(competidor);
	        	transaction.commit();
	    	} catch (Exception e) {
	        	if (transaction != null)
	            	  transaction.rollback();
	        	e.printStackTrace();
	    	}
	}

}
