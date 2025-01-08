package com.crud;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.entity.Banking;

public class FetchallRecords {
	
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Banking.class);
		
		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction ts = ss.beginTransaction();
		
		String hqlQuery = "from Banking";
		Query<Banking> query = ss.createQuery(hqlQuery, Banking.class);
		List<Banking> list = query.getResultList();
		
		for(Banking banking : list) {
			System.out.println(banking);
		}
	}

}
