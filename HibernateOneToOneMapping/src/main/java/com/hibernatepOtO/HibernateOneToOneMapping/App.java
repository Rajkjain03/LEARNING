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

		Bike b1 = new Bike(1234, "bajaj", 22000);
		Bike b2 = new Bike(2233, "maruti", 29000);
		Bike b3 = new Bike(3356, "tvs", 15000);
		Person p1 = new Person(11, "raj", 22 , b1);
		Person p2 = new Person(12, "amit", 19, b2);
		Person p3 = new Person(13, "anuj", 23, b3);

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
