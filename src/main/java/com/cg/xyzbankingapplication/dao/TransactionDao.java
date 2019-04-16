package com.cg.xyzbankingapplication.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.xyzbankingapplication.model.Transaction;

public interface TransactionDao extends JpaRepository<Transaction, Integer> {

	public List<Transaction>  findByCustomerId(int id);
}
