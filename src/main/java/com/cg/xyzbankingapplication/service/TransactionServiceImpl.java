package com.cg.xyzbankingapplication.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.xyzbankingapplication.dao.TransactionDao;
import com.cg.xyzbankingapplication.model.Transaction;


@Service("service1")
public class TransactionServiceImpl implements TransactionService {

	@Autowired
	TransactionDao transactiondao;
	@Override
	public List<Transaction> findByCustomerId(int id) {
		List<Transaction> list=transactiondao.findByCustomerId(id);
		
		return list;
	}
}
