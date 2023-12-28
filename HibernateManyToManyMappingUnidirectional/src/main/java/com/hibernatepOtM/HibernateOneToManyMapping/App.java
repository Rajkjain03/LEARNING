package com.hibernatepOtM.HibernateOneToManyMapping;

import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
    	Configuration cfg = new Configuration();
    	cfg.configure();
    	SessionFactory factory = cfg.buildSessionFactory();
    	Session session = factory.openSession();
    	Transaction tr = session.beginTransaction();
    	
    	Technology t1 = new Technology(123,"java");
    	Technology t2 = new Technology(124,"Html");
    	Technology t3 = new Technology(125,"css");
    	Technology t4 = new Technology(126,"sql");
    	
    	ArrayList<Technology> l1 = new ArrayList<Technology>();
    	l1.add(t1);
    	l1.add(t2);
    	
    	ArrayList<Technology> l2 = new ArrayList<Technology>();
    	l2.add(t1);
    	l2.add(t2);
    	l2.add(t3);
    	l2.add(t4);
    	
    	ArrayList<Technology> l3 = new ArrayList<Technology>();
    	l3.add(t1);
    	l3.add(t4);
    	
    	SoftwareEng se1 = new SoftwareEng(1,"sumit",29,l1);
    	SoftwareEng se2 = new SoftwareEng(2,"sourav",30,l2);
    	SoftwareEng se3 = new SoftwareEng(3,"sachin",28,l3);
    	
    	
    	session.save(t1);
    	session.save(t2);
    	session.save(t3);
    	session.save(t4);

    	session.save(se1);
    	session.save(se2);
    	session.save(se3);
    	
    	tr.commit();
    	System.out.println("object saved");
    	
    }
}
