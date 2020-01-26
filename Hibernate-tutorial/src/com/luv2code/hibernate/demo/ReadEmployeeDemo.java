package com.luv2code.hibernate.demo;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.luv2code.hibernate.demo.entity.Employee;

public class ReadEmployeeDemo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Employee.class).buildSessionFactory();
		Session session = factory.getCurrentSession();
		
		try {

	        session.beginTransaction();
	        List<Employee> e6 = session.createQuery("from Employee").getResultList();
	        
	        for(Employee theEmployee : e6) {
	        	System.out.println(theEmployee.toString());
	        }

	        
	        session.getTransaction().commit();
		}catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			session.close();
			factory.close();
		}
		
	}

}
