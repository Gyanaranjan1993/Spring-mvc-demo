package com.luv2code.hibernate.demo;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.luv2code.hibernate.demo.entity.Student;


public class CreateStudentDemo {

	public static void main(String[] args) {
		
		//Create Session factory
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student.class).buildSessionFactory();
		//Create a session
		Session session = factory.getCurrentSession();
		
		try {
			
		    //create a Student object
			System.out.println("Creating a new Student object");
			Student student = new Student("Puspanjali","Mohanty","puspa@gmail.com");
			System.out.println(student.toString());
			//start a transaction
			session.beginTransaction();
			
			//save the student object
			System.out.println("Saving the Student object");
			session.save(student);
			
			//commit the transaction
			System.out.println("Commit Student object");
			session.getTransaction().commit();
			
		}catch(Exception e) {e.printStackTrace();}
		
		finally {
			factory.close();
		}
		
	}

}
