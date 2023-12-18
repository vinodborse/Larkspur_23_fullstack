package com.ts;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
    	Configuration cfg = new Configuration()
				.configure("Hibernate.cfg.xml")
				.addAnnotatedClass(User.class)
				.addAnnotatedClass(Document.class);
		SessionFactory sf = cfg.buildSessionFactory();
		
		Session session =sf.openSession();
		
		session.beginTransaction();
		//----
			
		User u1 = new User();
		u1.setId(1);
		u1.setName("Vinod");
		
		
		Document doc1 = new Document(101, "PAN", "QWE123");
		Document doc2 = new Document(102, "AADHAR", "ZXC321Z");

		List<Document> docs = new ArrayList<Document>();
		
		docs.add(doc1);
		docs.add(doc2);
		
		u1.setDocuments(docs);
		
		session.save(u1);
		session.save(doc1);
		session.save(doc2);
		
		//----
		session.getTransaction().commit();
		session.close();
    }
}
