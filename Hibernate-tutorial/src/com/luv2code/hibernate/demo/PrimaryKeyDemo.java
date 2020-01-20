package com.luv2code.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.luv2code.hibernate.demo.entity.Student;

public class PrimaryKeyDemo {
	public static void main(String[] args) {
		//Create Session factory
		SessionFactory factory1 = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student.class).buildSessionFactory();
		//Create a session
		Session session = factory1.getCurrentSession();
		
		try {
			
		    //create a Student object
			System.out.println("Creating 3 student objects");
			Student student1 = new Student("Puspanjali","Mohanty","puspa@gmail.com");
			Student student2 = new Student("Umesh","Mohanty","umesh@gmail.com");
			Student student3 = new Student("Sabita","Mohanty","Sabita@gmail.com");
			
			System.out.println(student1.toString());
			System.out.println(student2.toString());
			System.out.println(student3.toString());
			//start a transaction
			session.beginTransaction();
			
			//save the student object
			System.out.println("Saving the Student object");
			session.save(student1);
			session.save(student2);
			session.save(student3);
			
			//commit the transaction
			System.out.println("Commit Student object");
			session.getTransaction().commit();
			
		}catch(Exception e) {e.printStackTrace();}
		
		finally {
			factory1.close();
		}
		
	}
}
