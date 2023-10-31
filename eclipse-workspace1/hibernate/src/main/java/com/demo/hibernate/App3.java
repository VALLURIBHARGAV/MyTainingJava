package com.demo.hibernate;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import com.demo.hibernate.config.HibernateConfig;

public class App3 {

	public static void main(String[] args) {
		SessionFactory sessionFactory=HibernateConfig.getSessionFactoryObject();
		 Session session=sessionFactory.openSession();
		 Query query= session.createNativeQuery("select prdid,prdname from product where prdcategory=?");
		 query.setParameter(1, "Toy");
		 List<Object[]> products=query.getResultList();
		 for(Object[] p:products) {
			 for(Object o:p)
			 System.out.print(o + "  ");
		 }
		 session.close();

	}

}
