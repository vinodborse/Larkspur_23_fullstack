package com.ts;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext ac = new ClassPathXmlApplicationContext("config.xml");
    	
    	Common c1 = ac.getBean("cm", Common.class);
    	System.out.println(c1);
    	Common c2 = ac.getBean("cm", Common.class);
    	System.out.println(c2);
    	Common c3 = ac.getBean("cm", Common.class);
    	System.out.println(c3);
    	
    	System.out.println("==================");
    	
    	User u1 = new User();
    	System.out.println(u1);
    	User u2 = new User();
    	System.out.println(u2);
    	User u3 = new User();
    	System.out.println(u3);
    }
}
