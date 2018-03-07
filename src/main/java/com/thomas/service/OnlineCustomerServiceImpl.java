package com.thomas.service;

import java.util.List;

import com.thomas.model.OnlineCustomer;
import com.thomas.repository.OnlineCustomerRepository;

public class OnlineCustomerServiceImpl implements OnlineCustomerService {

	private OnlineCustomerRepository customerRepository;

	public OnlineCustomerServiceImpl() {
		// TODO Auto-generated constructor stub
	}
	
	public OnlineCustomerServiceImpl(OnlineCustomerRepository customerRepository) {
		System.out.println("::::: Inside the constructor: OnlineCustomerServiceImpl");
		this.customerRepository = customerRepository;
	}
	
	/*
	 * (non-Javadoc)
	 * 
	 * @see com.thomas.service.CustomerService#findAll()
	 */
	@Override
	public List<OnlineCustomer> findAll() {
		return customerRepository.findAll();
	}

	public void setCustomerRepository(OnlineCustomerRepository customerRepository) {
		System.out.println("inside OnlineCustomerServiceImpl.setCustomerRepository ::::::::");
		this.customerRepository = customerRepository;
	}
	
}
