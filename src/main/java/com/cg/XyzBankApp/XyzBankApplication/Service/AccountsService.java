package com.cg.XyzBankApp.XyzBankApplication.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cg.XyzBankApp.XyzBankApplication.Model.Account;

@Service("accountsService")
public interface AccountsService {

	
	public List<Account> listAccounts();
	
	public Account addNewAccount( Account account);
	
	public String deleteAccount(Long no);
	public  Account findByAccountNo(Long no,Account account);
	

}



