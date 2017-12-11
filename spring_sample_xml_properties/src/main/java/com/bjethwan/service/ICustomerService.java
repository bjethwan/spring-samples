package com.bjethwan.service;

import java.util.List;

import com.bjethwan.model.Customer;

public interface ICustomerService {

	public abstract List<Customer> findAll();

}