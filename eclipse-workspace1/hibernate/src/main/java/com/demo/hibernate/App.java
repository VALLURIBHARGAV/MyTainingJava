package com.demo.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.demo.hibernate.config.HibernateConfig;
import com.demo.hibernate.entities.Product;

public class App {

public static void main(String[] args) {
	  SessionFactory sessionFactory=HibernateConfig.getSessionFactoryObject();
//	  Product prdObj = new Product(2,"Hibernate","Book",1900);
	  Session session = sessionFactory.openSession() ;
	  Transaction trans = session.beginTransaction();
//	  session.persist(prdObj);
//	  trans.commit();
//	  session.close();
	  Product proObj = session.get(Product.class, 1);
	  proObj.setPrdPrice(4000);
	  session.merge(proObj);
	  trans.commit();
	  session.close();
	  System.out.println(proObj);
	  
  }
}
