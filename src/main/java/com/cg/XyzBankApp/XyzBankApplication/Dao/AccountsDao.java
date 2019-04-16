package com.cg.XyzBankApp.XyzBankApplication.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.XyzBankApp.XyzBankApplication.Model.Account;



@Repository
public interface AccountsDao extends JpaRepository<Account,Long>{

}
