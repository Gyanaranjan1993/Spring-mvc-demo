package com.luv2code.springdemo.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.query.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.luv2code.springdemo.entity.Customer;

@Repository
public class CustomerDaoImpl implements CustomerDao {

	//inject Hibernate sessionfactory
	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	@Transactional
	public List<Customer> getCustomers() {
		
		//Get the session
		Session session = sessionFactory.getCurrentSession();
		
		
		//create the query
		String hql = "from Customer";
	    Query<Customer> query = session.createQuery(hql,Customer.class);
	    
		//Execute the query
	    List<Customer> customer = query.getResultList();
	    
		//return the list of customers
		return customer;
	}

}
