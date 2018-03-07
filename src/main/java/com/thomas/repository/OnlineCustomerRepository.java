package com.thomas.repository;

import java.util.List;

import com.thomas.model.OnlineCustomer;

public interface OnlineCustomerRepository {

	List<OnlineCustomer> findAll();

}