package com.cg.xyzbankingapplication.service;

import java.util.List;

import com.cg.xyzbankingapplication.model.Customer;
import com.cg.xyzbankingapplication.model.Transaction;


public interface CustomerService {

	public List<Customer> findAll();

	public void save(Customer customer);


	public Customer findById(Integer id);


	
	public Customer findByIdAndPassword(int id,String password);
	
}
