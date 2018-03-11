package com.thomas.repository;

import java.util.ArrayList;
import java.util.List;

import com.thomas.model.Customer;
import com.thomas.model.OnlineCustomer;

public class HibernateOnlineCustomerRepositoryImpl implements OnlineCustomerRepository {
	
	/* (non-Javadoc)
	 * @see com.thomas.repository.CustomerRepository#findAll()
	 */
	
	@Override
	public List<OnlineCustomer> findAll(){
		
		List<OnlineCustomer> customers = new ArrayList<>();
		OnlineCustomer customer = new OnlineCustomer();
		customer.setFirstName("Arjun - online");
		customer.setLastName("Thomas - online");
		customers.add(customer);
		return customers; 
	}

}