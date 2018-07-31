package com.capgemini.bankwallet.service;




import java.util.List;

import com.capgemini.bankwallet.bean.Account;
import com.capgemini.bankwallet.bean.Customer;
import com.capgemini.bankwallet.dao.BankWalletDao;

public class BankWalletService implements IBankWalletService{

	

	
	  BankWalletDao dao = new BankWalletDao();
		
		
	  public boolean addAccount(Account account) {
			return dao.addAccount(account);
			
		}


		public double showBalance() {
		
			
			return dao.showBalance();
		}

	
		public boolean depositAmount(double amount) {
			
			
			return dao.depositAmount(amount);
		}

		
		public boolean withdrawAmount(double amount) {
			
			return dao.withdrawAmount(amount);
		}

		
		public boolean loginAccount(String username, String password) {
			
			return dao.loginAccount(username, password);
		}

		
		public boolean fundTransfer(long accountNo, double amount) {
			
			return dao.fundTransfer(accountNo,amount);
		}

		public List<String> printTransaction() {
			return dao.printTransaction();
			
		}


}