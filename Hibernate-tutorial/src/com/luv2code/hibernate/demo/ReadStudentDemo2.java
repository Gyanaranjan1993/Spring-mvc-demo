package com.luv2code.hibernate.demo;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.luv2code.hibernate.demo.entity.Student;

public class ReadStudentDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SessionFactory factory = new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(Student.class)
				.buildSessionFactory();

		// create session
		Session session = factory.getCurrentSession();

		try {			
			// start a transaction
			session.beginTransaction();
			
			//query the table
			List<Student> theStudents = session.createQuery("from Student").getResultList();
			
			
			//Print the student
			for(Student tempStudent: theStudents) {
				System.out.println(tempStudent.toString());
			}


			List<Student> theStudent2 = session.createQuery("from Student s where s.lastName = 'Ducker'").getResultList();
			
			for(Student tempStudent: theStudent2) {
				System.out.println(tempStudent.toString());
			}

			
			//Get Student and Delete it
			
			Student student = session.get(Student.class, 1);
			System.out.println(student.toString());
			session.delete(student);
			
			//Delete from Student with lastname = ducker
			
			session.createQuery("delete from Student s where s.lastName = 'Ducker'").executeUpdate();
			
			System.out.println("Done!");
			
			
			// commit transaction
			session.getTransaction().commit();
		}
		finally {
			session.close();
			factory.close();
		}
	}

}


