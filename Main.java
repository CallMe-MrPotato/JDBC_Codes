package com.jbk.dec30;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Aadhar.class);
		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction ts = ss.beginTransaction();
		
		Aadhar a = new Aadhar();
		a.setAname("Manjeet");
		a.setAnumber(39877456l);
		a.setAddress("Naka no.2");
		a.setMobile(7234998991l);
		
		ss.persist(a);
		System.out.println(a);
		ts.commit();
		
		System.out.println("Application is Running....");
	}
}
