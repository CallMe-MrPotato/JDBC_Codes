package com.jbk;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Banking.class);
		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction ts = ss.beginTransaction();
		
		Banking b = new Banking();
		
		b.setName("Kashyap");
		b.setAccountNo(43256789878l);
		b.setBankname("Indian Post bank");
		b.setIFSC("IPSB021355");
		b.setBranch("Garoba Maidan");
		
		ss.persist(b);
		System.out.println(b);
		ts.commit();
		
		System.out.println("Application is Running...");
	}

}
