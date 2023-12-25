package com.hibernatep.HibernateP2;

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

		Person p1 = new Person(1, "raj", 22);
		session.save(p1);
		Person p2 = new Person(2, "amit", 19);
		session.save(p2);
		Person p3 = new Person(3, "anuj", 23);
		session.save(p3);
		
		Bike b1 = new Bike(1, "bajaj", 22000);
		session.save(b1);
		Bike b2 = new Bike(2, "maruti", 29000);
		session.save(b2);
		Bike b3 = new Bike(3, "tvs", 15000);
		session.save(b3);
		
		tr.commit();

		System.out.println("Person object created and saved");
		System.out.println("Person object created and saved");

	}
}
