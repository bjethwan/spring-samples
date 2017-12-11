package com.bjethwan.repository;

import java.util.ArrayList;
import java.util.List;

import com.bjethwan.model.Customer;

public class HibernateCustomerRepositoryImpl implements ICustomerRepository {

	private String dbUsername;	
	private String dbPassword;
	private String dbUrl;

	@Override
	public List<Customer> findAll(){
		List<Customer> list = new ArrayList<>();

		Customer customer = new Customer();
		customer.setFirstName("Bipin");
		customer.setLastName("Jethwani");

		list.add(customer);

		return list;

	}

	public String getDbPassword() {
		return dbPassword;
	}

	public String getDbUrl() {
		return dbUrl;
	}

	public String getDbUsername() {
		return dbUsername;
	}

	public void setDbPassword(String dbPassword) {
		System.out.println("setDbPassword: "+ dbPassword);
		this.dbPassword = dbPassword;
	}

	public void setDbUrl(String dbUrl) {
		System.out.println("setDbUrl: "+ dbUrl);
		this.dbUrl = dbUrl;
	}

	public void setDbUsername(String dbUsername) {
		System.out.println("setDbUsername: "+ dbUsername);
		this.dbUsername = dbUsername;
	}
}
