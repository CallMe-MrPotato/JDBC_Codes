package com.jbk.dec30;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.arjuna.ats.arjuna.recovery.Service;

public class SMain {
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Employee.class);
		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction ts = ss.beginTransaction();
		
		Employee e = new Employee();
		
		 e.setEid(44);
		 e.setEname("Abdul");
		 e.setMobile(9878599999l);
		 e.setCompanyName("Abdul Suits Factory");
		 e.setSalary(45900.0);
		 
		 ss.persist(e);
		 System.out.println(e);
		 ts.commit();
		
		System.out.println("Application is running...");
	}

}
