package com.globallogic.hibernate_example.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.globallogic.hibernate_example.config.HibernateConfig;
import com.globallogic.hibernate_example.entity.Menu;

public class MenuDao {

	public void createMenu(Menu menu) {
		Transaction transaction = null;
    	try (Session session = HibernateConfig.getSessionFactory().openSession()) {
   		 transaction = session.beginTransaction();
        	session.save(menu);
        	transaction.commit();
    	} catch (Exception e) {
        	if (transaction != null) {
            	transaction.rollback();
        	}
        	e.printStackTrace();
    	}
	}
	
	public List<Menu> getMenuById(long id) {
		try (Session session = HibernateConfig.getSessionFactory().openSession()) {
	   		 return session.createQuery("from Menu m where m.id=:id", 
	   				 Menu.class).setParameter("id", id).list();
	   	 }
	}
	
	public List<Menu> getAllMenus(){
		try (Session session = HibernateConfig.getSessionFactory().openSession()) {
        	return session.createQuery("from Menu", Menu.class).list();
    	}
	}
	
	public void updateMenu(Menu menu) {
	   	 Transaction transaction = null;
	    	try (Session session = HibernateConfig.getSessionFactory().openSession()) {
	   		 transaction = session.beginTransaction();
	        	session.update(menu);
	        	transaction.commit();
	    	} catch (Exception e) {
	        	if (transaction != null)
	            	  transaction.rollback();
	        	e.printStackTrace();
	    	}
	}
	
	public void removeMenu(Menu menu) {
	   	 Transaction transaction = null;
	    	try (Session session = HibernateConfig.getSessionFactory().openSession()) {
	   		 transaction = session.beginTransaction();
	        	session.delete(menu);
	        	transaction.commit();
	    	} catch (Exception e) {
	        	if (transaction != null)
	            	  transaction.rollback();
	        	e.printStackTrace();
	    	}
	}
	
}
