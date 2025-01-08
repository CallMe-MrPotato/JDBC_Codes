package com.crud;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.MutationQuery;

import com.entity.Aadhar;

public class Update {
	
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Aadhar.class);
		
		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction ts = ss.beginTransaction();
		
		String hqlQuery = "update Aadhar set Aname =: myname, Address =: myaddress where Aid =: myid";
		MutationQuery mquery = ss.createMutationQuery(hqlQuery);
		mquery.setParameter("myname", "Shivani");
		mquery.setParameter("myaddress", "Nandanvan");
		mquery.setParameter("myid", 3);
		mquery.executeUpdate();
		System.out.println("data is updated");
		ts.commit();
		ss.close();
	}

}
