package com.jbk;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class HMain {
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Hospital.class);
		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction ts = ss.beginTransaction();
		
		Hospital h = new Hospital();
		
		h.setPname("Hansika");
		h.setAge(27);
		h.setGender("Female");
		h.setMobile(7654217621l);
		h.setPid(53);
		
		ss.persist(h);
		System.out.println(h);
		ts.commit();
		
		System.out.println("Application is Running...");
	}

}
