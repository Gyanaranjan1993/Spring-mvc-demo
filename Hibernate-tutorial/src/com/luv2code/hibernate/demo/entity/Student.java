package com.luv2code.hibernate.demo.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@SuppressWarnings("serial")
@Entity
@Table(name="student")
//The session object needs to be serializable hence all objects referenced by it must be serializable as well. 
//The id is used as a key to index loaded objects in the session. In case of CompositeId s the class itself is used as the id.
public class Student implements Serializable {
     
	

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	

	@Column(name="first_name")
	private String firstName;
	

	@Column(name="last_name")
	private String lastName;
	
	
	@Column(name="email")
	private String email;
	
		
	public Integer getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public String getEmail() {
		return email;
	}


	@Override
	public String toString() {
		return "Student [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email + "]";
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public Student() {
		
	}
	
	public Student(String firstName, String lastName, String email) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
    	 
     }
}
