package com.crud;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.MutationQuery;

import com.entity.Banking;

public class Insert {
	
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Banking.class);
		
		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction ts = ss.beginTransaction();
		
		String hqlQuery = "insert into Banking(Bname, Branch, AccHolder) values(:myBname, :myBranch, :myAccholder)";
		MutationQuery mquery = ss.createMutationQuery(hqlQuery);
		mquery.setParameter("myBname", "Axis Bank");
		mquery.setParameter("myBranch", "Indora");
		mquery.setParameter("myAccholder", "Ganesh");
		mquery.executeUpdate();
		System.out.println("data is inserted");
		ts.commit();
		ss.close();
	}

}
