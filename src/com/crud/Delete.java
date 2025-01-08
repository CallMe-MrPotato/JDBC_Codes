package com.crud;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.entity.Banking;

public class Delete {
	
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Banking.class);
		
		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction ts = ss.beginTransaction();
		
		String hqlQuery = "delete from Banking where Bid =: mybid";
		int mybid = 4;
		Query<Banking> query = ss.createQuery(hqlQuery);
		query.setParameter("mybid", mybid);
		query.executeUpdate();
		System.out.println("data is deleted");
		ts.commit();
		ss.close();
	}

}
