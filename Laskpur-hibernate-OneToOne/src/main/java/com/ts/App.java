package com.ts;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args ) {

    	Configuration cfg = new Configuration()
    											.configure("Hibernate.cfg.xml")
    											.addAnnotatedClass(User.class)
    											.addAnnotatedClass(Pancard.class);
    	SessionFactory sf = cfg.buildSessionFactory();
    	
    	Session session =sf.openSession();
    	
    	session.beginTransaction();
    	//----
    		User usr = new User();
    		usr.setId(101);
    		usr.setName("Vinod");
    		session.save(usr);
    	
    		Pancard pc = new Pancard();
    	pc.setId(1);
    	pc.setNumber("ASDFG123");
    	pc.setUser(usr);
    	session.save(pc);
    		
    		
    		
    	//----
    	session.getTransaction().commit();
    	session.close();
    }

}
