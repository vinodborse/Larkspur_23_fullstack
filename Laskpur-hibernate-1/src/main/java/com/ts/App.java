package com.ts;

import java.util.Date;

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
    		
    		Student s1 = new Student();
    		s1.setName("Bholu");
    		s1.setAddress("Dholak pur");
    		s1.setDob(new Date());
    		session.save(s1);
    		
    		Student s2 = new Student("SRK", "Mumbai", new Date());
    		session.save(s2);
    		Student s3 = new Student("Vinod", "Pune", new Date());
    		session.save(s3);
    		
//    		Student s = new Student();
//   		s.setRollno(6);
// 		    session.delete(s);
    	
//    	Student s = session.get(Student.class, 2);
//    	System.out.println(s.getName());
    	
    	//----
    	session.getTransaction().commit();
    	session.close();
    	//-------
    }
}