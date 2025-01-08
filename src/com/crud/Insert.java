package com.crud;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.MutationQuery;

import com.entity.Aadhar;

public class Insert {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Aadhar.class);
		
		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction ts = ss.beginTransaction();
		
		String hqlQuery = "insert into Aadhar(Aname, Address, Anumber) values(:myname, :myaddress, :mynumber)";
		MutationQuery query = ss.createMutationQuery(hqlQuery);
		query.setParameter("myname", "Deepak");
		query.setParameter("myaddress", "Birdi");
		query.setParameter("mynumber", 9987399834l);
		query.executeUpdate();
		System.out.println("data is inserted");
		ts.commit();
		ss.close();
		
	}
}
