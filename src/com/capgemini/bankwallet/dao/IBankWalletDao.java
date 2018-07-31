package com.capgemini.bankwallet.dao;


import java.util.List;

import com.capgemini.bankwallet.bean.Account;
import com.capgemini.bankwallet.bean.Customer;


public interface IBankWalletDao {
	public boolean addAccount(Account account);
	public double showBalance();
	public boolean depositAmount(double amount) ;
	public boolean withdrawAmount(double amount);

	public boolean loginAccount(String username,String password);
	public boolean fundTransfer(long accountNo,double amount);
	public List<String> printTransaction();
}

