package com.cg.xyzbankingapplication.service;

import java.util.List;

import com.cg.xyzbankingapplication.model.Transaction;

public interface TransactionService {
	public List<Transaction>  findByCustomerId(int id);
}
