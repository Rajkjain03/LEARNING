package com.hibernatepOtO.HibernateOneToOneMapping;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure();
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		Transaction tr = session.beginTransaction();
		
		Person p1 = new Person();
		Person p2 = new Person();
		Person p3 = new Person();
		Bike b1 = new Bike(1234, "bajaj", 22000,p1);
		Bike b2 = new Bike(2233, "maruti", 29000,p2);
		Bike b3 = new Bike(3356, "tvs", 15000,p3);
		
		p1.setP_id(11);
		p1.setP_name("ajay");
		p1.setP_age(26);
		p1.setB(b1);
		
		p2.setP_id(12);
		p2.setP_name("mohan");
		p2.setP_age(29);
		p2.setB(b2);
		
		p3.setP_id(13);
		p3.setP_name("rakesh");
		p3.setP_age(32);
		p3.setB(b3);

		session.save(b1);
		session.save(b2);
		session.save(b3);
		session.save(p1);
		session.save(p2);
		session.save(p3);
		
		tr.commit();

		System.out.println("object created and saved");

	}
}
