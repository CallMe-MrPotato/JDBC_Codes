package com.crud;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.entity.Banking;

public class FetchsingleRecord {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Banking.class);
		
		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction ts = ss.beginTransaction();
		
		String hqlQuery ="from Banking where Bid =: mybid";
		Query<Banking> query = ss.createQuery(hqlQuery, Banking.class);
		query.setParameter("mybid", 1);
		
		Banking b = query.getSingleResult();
		System.out.println(b);
	}
}
