package com.thomas.service;

import java.util.List;

import com.thomas.model.Customer;
import com.thomas.repository.CustomerRepository;

public class CustomerServiceImpl implements CustomerService {

	private CustomerRepository customerRepository;

	public CustomerServiceImpl() {
		// TODO Auto-generated constructor stub
	}
	
	public CustomerServiceImpl(CustomerRepository customerRepository) {
		System.out.println("::::: Inside the constructor: CustomerServiceImpl");
		this.customerRepository = customerRepository;
	}
	
	/*
	 * (non-Javadoc)
	 * 
	 * @see com.thomas.service.CustomerService#findAll()
	 */
	@Override
	public List<Customer> findAll() {
		return customerRepository.findAll();
	}

	public void setCustomerRepository(CustomerRepository customerRepository) {
		System.out.println("inside setCustomerRepository ::::::::");
		this.customerRepository = customerRepository;
	}
	
}
