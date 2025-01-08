package com.crud;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.entity.Aadhar;

public class GetallRecord {
	
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Aadhar.class);
		
		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction ts = ss.beginTransaction();
		
		String hqlQuery ="from Aadhar";
		Query<Aadhar> query = ss.createQuery(hqlQuery, Aadhar.class);
		List<Aadhar> list = query.getResultList();
		
		for(Aadhar aadhar : list) {
			System.out.println(aadhar);
		}
	}

}
