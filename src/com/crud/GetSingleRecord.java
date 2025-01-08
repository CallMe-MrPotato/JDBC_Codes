package com.crud;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.entity.Aadhar;

public class GetSingleRecord {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Aadhar.class);
		
		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction ts = ss.beginTransaction();
		
		String hqlQuery ="from Aadhar where Aid =: myid";
		Query<Aadhar> query = ss.createQuery(hqlQuery, Aadhar.class);
		query.setParameter("myid", 1);
		
		Aadhar a = query.getSingleResult();
		System.out.println(a);
	}
}
