package com.hibernatepOtM.HibernateManyToManyMappingBiDirectional;

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
    	
    	SoftwareEng se1 = new SoftwareEng();
    	SoftwareEng se2 = new SoftwareEng();
    	SoftwareEng se3 = new SoftwareEng();
    	
    	se1.setId(1);
    	se1.setName("sumit");
    	se1.setAge(29);
    	se2.setId(2);
    	se2.setName("sourav");
    	se2.setAge(30);
    	se3.setId(3);
    	se3.setName("sachin");
    	se3.setAge(28);
    	
    	ArrayList<SoftwareEng> ls1 = new ArrayList<SoftwareEng>();
    	ls1.add(se1);
    	ls1.add(se2);
    	ls1.add(se3);
    	ArrayList<SoftwareEng> ls2 = new ArrayList<SoftwareEng>();
    	ls2.add(se1);
    	ls2.add(se2);
    	ArrayList<SoftwareEng> ls3 = new ArrayList<SoftwareEng>();
    	ls3.add(se2);
    	ArrayList<SoftwareEng> ls4 = new ArrayList<SoftwareEng>();
    	ls4.add(se2);
    	ls4.add(se3);
    	
    	Technology t1 =new Technology(123, "java", ls1);
    	Technology t2 =new Technology(124, "html", ls2);
    	Technology t3 =new Technology(125, "css", ls3);
    	Technology t4 =new Technology(126, "sql", ls4);
    	
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
    	
    	se1.setLs(l1);
    	se2.setLs(l2);
    	se3.setLs(l3);
    	
    	session.save(se1);
    	session.save(se2);
    	session.save(se3);
    	session.save(t1);
    	session.save(t2);
    	session.save(t3);
    	session.save(t4);
    	
    	tr.commit();
    	System.out.println("Object are saved");
    }
}
