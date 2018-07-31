package com.capgemini.bankwallet.bean;

import java.util.List;

public class Account  {

	
	private long accountNo;
	private double balance;
	
	private Customer customer;
	private List<String> transaction;
	
	public List<String> getTransaction() {
		return transaction;
	}
	public void setTransaction(List<String> transaction) {
		this.transaction = transaction;
	}
	
	public long getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(long accountN0) {
		this.accountNo= accountNo;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	

}
	
	

