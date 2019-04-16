package com.cg.XyzBankApp.XyzBankApplication.Dao;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.XyzBankApp.XyzBankApplication.Model.Transactions;


@Repository
public interface TransactionDao extends JpaRepository<Transactions , Long>{
	
	List<Transactions> findByAccountNo(Long accountNo);
    Optional<Transactions> findByIdAndAccountNo(Long id, Long accountNo);

}
