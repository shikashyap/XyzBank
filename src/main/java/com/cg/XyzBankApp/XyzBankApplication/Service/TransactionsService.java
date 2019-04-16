package com.cg.XyzBankApp.XyzBankApplication.Service;

import java.util.List;

import org.springframework.stereotype.Service;
import com.cg.XyzBankApp.XyzBankApplication.Model.Transactions;

@Service("transactionsService")
public interface TransactionsService {

	public List<Transactions> getAllTransactionsByAccountNo(Long accountNo);
	public Transactions insertTransaction(Long accountNo,Transactions transaction);
}
