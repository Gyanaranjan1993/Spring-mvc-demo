package com.luv2code.springdemo.dao;

import java.util.List;

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

	@Override
	public void saveCustomer(Customer theCustomer) {
		//Get the session
		Session session = sessionFactory.getCurrentSession();
		
		session.saveOrUpdate(theCustomer);
		
	}

	@Override
	public Customer getCustomer(int theId) {
		
		//Get the session
		Session session = sessionFactory.getCurrentSession();
		
		//Retrieve the object
		Customer theCustomer = session.get(Customer.class, theId);
		
		//return 
		return theCustomer;
		
		
	}

	@Override
	public void deleteCustomer(int theId) {
		//Get the session
	    Session session = sessionFactory.getCurrentSession();
	    
	    //Delete the customer
	    Query theQuery = session.createQuery("delete from Customer where id=:customerId");
	    theQuery.setParameter("customerId", theId);
	    theQuery.executeUpdate();
	    

		
	}

}
