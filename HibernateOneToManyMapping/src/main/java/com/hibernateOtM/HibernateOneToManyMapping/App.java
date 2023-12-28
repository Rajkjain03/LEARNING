package com.hibernateOtM.HibernateOneToManyMapping;

import java.util.ArrayList;
import java.util.List;

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
    	
    	Student s1 = new Student();
    	Student s2 = new Student();
    	Student s3 = new Student();
    	
    	s1.setS_rollNo(1);
    	s1.setS_name("rohit");
    	s2.setS_rollNo(2);
    	s2.setS_name("suraj");
    	s3.setS_rollNo(3);
    	s3.setS_name("manoj");
    	
    	Laptop l1 = new Laptop();
    	Laptop l2 = new Laptop();
    	Laptop l3 = new Laptop();
    	Laptop l4 = new Laptop();
    	Laptop l5 = new Laptop();
    	Laptop l6 = new Laptop();
    	Laptop l7 = new Laptop();
    	
    	l1.setL_SrNo(1223);
    	l1.setL_brand("Hp");
    	l2.setL_SrNo(1224);
    	l2.setL_brand("lenovo");
    	l3.setL_SrNo(1225);
    	l3.setL_brand("dell");
    	l4.setL_SrNo(1226);
    	l4.setL_brand("asus");
    	l5.setL_SrNo(1227);
    	l5.setL_brand("mac");
    	l6.setL_SrNo(1228);
    	l6.setL_brand("accer");
    	l7.setL_SrNo(1229);
    	l7.setL_brand("mi");
    	
    	List<Laptop> list1 = new ArrayList<Laptop>();
    	list1.add(l2);
    	list1.add(l4);
    	
    	List<Laptop> list2 = new ArrayList<Laptop>();
    	list2.add(l1);
    	list2.add(l3);
    	list2.add(l6);
    	
    	List<Laptop> list3 = new ArrayList<Laptop>();
    	list3.add(l5);
    	list3.add(l7);
    	
    	s1.setLs(list1);
    	s2.setLs(list2);
    	s3.setLs(list3);
    	
    	l1.setS(s2);
    	l2.setS(s1);
    	l3.setS(s2);
    	l4.setS(s1);
    	l5.setS(s3);
    	l6.setS(s2);
    	l7.setS(s3);
    	
    	session.save(s1);
    	session.save(s2);
    	session.save(s3);
    	session.save(l1);
    	session.save(l2);
    	session.save(l3);
    	session.save(l4);
    	session.save(l5);
    	session.save(l6);
    	session.save(l7);
    	
    	tr.commit();
    	System.out.println("object save");
    }
}
