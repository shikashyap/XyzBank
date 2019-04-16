package com.cg.xyzbankingapplication.service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.xyzbankingapplication.dao.CustomerDao;
import com.cg.xyzbankingapplication.model.Customer;
import com.cg.xyzbankingapplication.model.Transaction;

@Service("service")
public class CustomerServiceImpl implements CustomerService {

	@PersistenceContext
	private EntityManager em;

	@Autowired
	private CustomerDao customerdao;

	@Override
	public List<Customer> findAll() {
		List<Customer> customerlist = customerdao.findAll();
		return customerlist;
	}

	@Override
	public void save(Customer customer) {
		customerdao.save(customer);

	}

	@Override
	public Customer findById(Integer id) {
		Customer customer = customerdao.findById(id).get();
		return customer;
	}

	@Override
	public Customer findByIdAndPassword(int id, String password) {
		try {
			Customer customer = customerdao.findByIdAndPassword(id, password);
			return customer;
		} catch (Exception e) {
			return null;
		}
	}

}
