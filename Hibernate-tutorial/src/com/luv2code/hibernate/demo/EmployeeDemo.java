package com.luv2code.hibernate.demo;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.luv2code.hibernate.demo.entity.Employee;

public class EmployeeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Employee.class).buildSessionFactory();
		Session session = factory.getCurrentSession();
		
		try {
			
	        Employee e1 = new Employee("Gyana","Mohanty","TCS");
	        Employee e2 = new Employee("Gyana","Mohanty","Cognizant");
	        Employee e3 = new Employee("Gyana","Mohanty","Capgemini");
	        
	        session.beginTransaction();
	        
	        //Insert done
	        session.save(e1);
	        session.save(e2);
	        session.save(e3);
	        
	        session.getTransaction().commit();
	        
	        session=factory.getCurrentSession();
	        session.beginTransaction();
	        Employee e4 = session.get(Employee.class, "TCS");
	        System.out.println(e4.toString());
	        e4.setLastName("Patnaik");
	        session.getTransaction().commit();
	        
	        session=factory.getCurrentSession();
	        session.beginTransaction();
	        Employee e5 = session.get(Employee.class, "TCS");
	        System.out.println(e5.toString());
	        session.delete(e5);
	        session.getTransaction().commit();
	        
	        session=factory.getCurrentSession(); 
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
