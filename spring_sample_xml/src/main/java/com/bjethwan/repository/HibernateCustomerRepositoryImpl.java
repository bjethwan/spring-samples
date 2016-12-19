package com.bjethwan.repository;

import java.util.ArrayList;
import java.util.List;

import com.bjethwan.model.Customer;

public class HibernateCustomerRepositoryImpl implements ICustomerRepository {

	

	@Override
	public List<Customer> findAll(){
		List<Customer> list = new ArrayList<>();
		
		Customer customer = new Customer();
		customer.setFirstName("Bipin");
		customer.setLastName("Jethwani");
		
		list.add(customer);
		
		return list;
		
	}
}
