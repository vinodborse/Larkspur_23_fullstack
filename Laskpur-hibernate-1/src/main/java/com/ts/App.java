package com.ts;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
    	//-------
    	Configuration cfg = new Configuration()
    											.configure("Hibernate.cfg.xml")
    											.addAnnotatedClass(Student.class)
    											.addAnnotatedClass(Teacher.class);
    	SessionFactory sf = cfg.buildSessionFactory();
    	
    	Session session =sf.openSession();
    	
    	session.beginTransaction();
    	//----
    		
    	//----
    	session.getTransaction().commit();
    	session.close();
    	//-------
    }
}
