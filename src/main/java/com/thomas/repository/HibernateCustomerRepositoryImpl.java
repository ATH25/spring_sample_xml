package com.thomas.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;

import com.thomas.model.Customer;

public class HibernateCustomerRepositoryImpl implements CustomerRepository {
	
	/* (non-Javadoc)
	 * @see com.thomas.repository.CustomerRepository#findAll()
	 */
	
	@Value("${dbUsername}")
	private String dbUsername;
	
/*	public void setdbUsername(String dbUsername) {
		this.dbUsername = dbUsername;
	} */
	
	@Override
	public List<Customer> findAll(){
		System.out.println("dbUsername :" + dbUsername);
		
		List<Customer> customers = new ArrayList<>();
		Customer customer = new Customer();
		customer.setFirstName("Arjun");
		customer.setLastName("Thomas");
		customers.add(customer);
		return customers; 
	}

}
