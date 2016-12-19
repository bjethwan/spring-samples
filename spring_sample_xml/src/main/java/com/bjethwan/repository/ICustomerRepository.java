package com.bjethwan.repository;

import java.util.List;

import com.bjethwan.model.Customer;

public interface ICustomerRepository {

	public abstract List<Customer> findAll();

}