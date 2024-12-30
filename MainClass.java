package com.jbk.dec29;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class MainClass {
	
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Student.class);
		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction ts = ss.beginTransaction();
		
		Student s = new Student();
		s.setId(5);
		s.setName("Priya");
		s.setAge(22);
		s.setAddress("Jaripatka");
		s.setMobile(7621283433l);
		
		ss.persist(s);
		System.out.println(s);
		ts.commit();
		System.out.println("Application is Started...");
	}

}
