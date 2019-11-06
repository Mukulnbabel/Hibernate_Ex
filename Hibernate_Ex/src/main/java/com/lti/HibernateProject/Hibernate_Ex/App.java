package com.lti.HibernateProject.Hibernate_Ex;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
    	Configuration configuration=new  Configuration().configure();
    	StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties());
    	SessionFactory factory = configuration.buildSessionFactory(builder.build());
    	Session session=factory.openSession();
    	Employee emp=new Employee();
    	
    	emp.setEmpName("mukul");
    	emp.setBranch("CSE");
    	session.beginTransaction();
    	session.save(emp);
    	session.getTransaction().commit();
    }
}
