package com.cg.xyzbankingapplication.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="transactions")

public class Transaction {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq2")
	@SequenceGenerator(name = "seq2", sequenceName = "trans_id_seq", allocationSize = 1)
	private int id;
	
	private int amount;
	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	private String type;
	
	@ManyToOne
	@JoinColumn(name="cust_id")
	private Customer customer;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
}
