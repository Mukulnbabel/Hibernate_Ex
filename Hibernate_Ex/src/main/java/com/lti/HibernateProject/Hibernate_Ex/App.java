package com.lti.HibernateProject.Hibernate_Ex;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import com.lti.HibernateProject.Hibernate_Ex.Employee;

public class App 
{
    public static void main( String[] args )
    {try{
    	Configuration configuration = new  Configuration().configure();
    	StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties());
    	SessionFactory factory = configuration.buildSessionFactory(builder.build());
    	Session session=factory.openSession();
    	Employee employee=new Employee();
    	
    	employee.setEmpName("mukul");
    	employee.setBranch("CSE");
    	session.beginTransaction();
    	session.save(employee);
    	session.getTransaction().commit();
    }
    catch (Exception e) {
		e.printStackTrace();
	}
    }
}
