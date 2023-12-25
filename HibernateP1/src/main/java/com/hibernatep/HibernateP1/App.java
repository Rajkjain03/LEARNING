package com.hibernatep.HibernateP1;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {	Configuration cfg = new Configuration();
    	cfg.configure();
    	SessionFactory factory = cfg.buildSessionFactory();
    	Session session =  factory.openSession();
    	Transaction tr = session.beginTransaction();
    	
    	Student st = new Student(11,"amit",78);
    	session.save(st);
    	Student s2 = new Student(12,"anuj",43);
    	session.save(s2);
    	tr.commit();
    	System.out.println("student object created and saved");
    	
    }
}
