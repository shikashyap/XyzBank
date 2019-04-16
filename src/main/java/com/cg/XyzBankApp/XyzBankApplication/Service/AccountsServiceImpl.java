package com.cg.XyzBankApp.XyzBankApplication.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.XyzBankApp.XyzBankApplication.Dao.AccountsDao;
import com.cg.XyzBankApp.XyzBankApplication.Exception.ResourceNotFoundException;
import com.cg.XyzBankApp.XyzBankApplication.Model.Account;

@Service("accountsService")
public class AccountsServiceImpl implements AccountsService {

	@Autowired
	private AccountsDao accountsDao;
	
	@Override
	public List<Account> listAccounts() {
		List<Account> accountList = accountsDao.findAll();
		return accountList;
	}

	@Override
	public Account addNewAccount(Account account) {
		return accountsDao.save(account);
	}

	@Override
	public String deleteAccount(Long no) {

        return accountsDao.findById(no).map(account -> {
        	accountsDao.delete(account);
            return "deleted";
        }).orElseThrow(() -> new ResourceNotFoundException("Account No " + no + " not found"));

		
	}

	@Override
	public Account findByAccountNo(Long no, Account account) {
		Account updatedAccount=accountsDao.findById(no).map(a -> {
            a.setName(account.getName());
            a.setAmount(account.getAmount());
            return accountsDao.save(a);
        }).orElseThrow(() -> new ResourceNotFoundException("Account No " + no + " not found"));
		return updatedAccount;
	}
	}


