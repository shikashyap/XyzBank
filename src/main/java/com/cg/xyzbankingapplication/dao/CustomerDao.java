package com.cg.xyzbankingapplication.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.xyzbankingapplication.model.Customer;


public interface CustomerDao extends JpaRepository<Customer, Integer>{

	public Customer findByIdAndPassword(int id,String password);
}
