package com.demo.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.demo.hibernate.config.HibernateConfig;
import com.demo.hibernate.entities.Address;
import com.demo.hibernate.entities.Employee;


public class App5 {

	public static void main(String[] args) {
		SessionFactory sessionFactory = HibernateConfig.getSessionFactoryObject();
		Session session=sessionFactory.openSession();
		Employee empObj = new Employee("Bhargav",35159);
		Address addObj = new Address("Chennai","India");
		empObj.setEmpAddress(addObj);
		Transaction trnx = session.beginTransaction();
		session.persist(empObj);
		session.persist(addObj);
		trnx.commit();
		session.close();
		System.out.println(empObj);
		System.out.println(addObj);
		
	}

}
