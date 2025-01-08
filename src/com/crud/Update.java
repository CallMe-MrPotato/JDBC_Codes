package com.crud;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.MutationQuery;

import com.entity.Banking;

public class Update {
	public static void main(String[] args) {
	Configuration cfg = new Configuration();
	cfg.configure("hibernate.cfg.xml");
	cfg.addAnnotatedClass(Banking.class);
	
	SessionFactory sf = cfg.buildSessionFactory();
	Session ss = sf.openSession();
	Transaction ts = ss.beginTransaction();
	
	String hqlQuery ="update Banking set Bname =: mybname, AccHolder =: myaccholder where Bid =: mybid ";
	MutationQuery mquery = ss.createMutationQuery(hqlQuery);
	mquery.setParameter("mybname", "Indian bank");
	mquery.setParameter("myaccholder", "Pratham");
	mquery.setParameter("mybid", 3);
	mquery.executeUpdate();
	System.out.println("Data is updated");
	ts.commit();
	ss.close();
	
	}
}
