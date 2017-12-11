package com.bjethwan.service;

import java.util.List;

import com.bjethwan.model.Customer;
import com.bjethwan.repository.ICustomerRepository;

public class CustomerServiceImpl implements ICustomerService {

	private ICustomerRepository customerRepository;


	@Override
	public List<Customer> findAll(){
		return customerRepository.findAll();

	}


	public void setCustomerRepository(ICustomerRepository customerRepository) {
		this.customerRepository = customerRepository;
	}


}
