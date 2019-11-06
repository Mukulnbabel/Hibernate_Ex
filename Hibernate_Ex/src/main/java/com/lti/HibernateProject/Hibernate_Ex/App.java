package com.lti.HibernateProject.Hibernate_Ex;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
    	Configuration con=new  Configuration().configure();
    	StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder().applySettings(con.getProperties());
    	SessionFactory factory = con.buildSessionFactory(builder.build());
    	Session session=factory.openSession();
    	Employee emp=new Employee();
    	
    	emp.setEmpName("mukul");
    	emp.setBranch("CSE");
    	session.beginTransaction();
    	session.save(emp);
    	session.getTransaction().commit();
    }
}
