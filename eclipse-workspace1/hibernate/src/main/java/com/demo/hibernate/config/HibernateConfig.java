package com.demo.hibernate.config;

import java.util.Properties;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import com.demo.hibernate.entities.Address;
import com.demo.hibernate.entities.Employee;
import com.demo.hibernate.entities.Product;

public class HibernateConfig {
private static SessionFactory sessionFactory=getSessionFactory();
	
	public static SessionFactory getSessionFactoryObject() {
		return sessionFactory;
	}
	private static SessionFactory getSessionFactory() {
		//create configuration object
		Configuration config=new Configuration();
		//Add entity mapping
		config.addAnnotatedClass(Product.class);
		config.addAnnotatedClass(Employee.class);
		config.addAnnotatedClass(Address.class);
		//Standard registry builder object
		StandardServiceRegistryBuilder ssrb=new StandardServiceRegistryBuilder();
		//load the properties
		Properties properties=config.getProperties();
		//Service registry with properties
		StandardServiceRegistry serviceRegistry=ssrb.applySettings(properties).build();
		//Create Session Factory
		sessionFactory=config.buildSessionFactory(serviceRegistry);
		return sessionFactory;
	}
	
}
