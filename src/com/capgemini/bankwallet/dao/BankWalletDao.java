package com.capgemini.bankwallet.dao;




import java.util.HashMap;
import java.util.List;

import com.capgemini.bankwallet.bean.Account;





public class BankWalletDao implements IBankWalletDao {
	
	public static HashMap<String,Account> map = new HashMap<String,Account>();


	public static Account acc1;
	
	int transactionId=(int) ((Math.random()*123)+999);	
	


	
public boolean addAccount(Account account) {
		map.put(account.getCustomer().getUsername(), account);
		
		return true;
	}



public double showBalance() {
		return acc1.getBalance();
}



public boolean depositAmount(double amount) {
		acc1.setBalance(acc1.getBalance()+amount);

		String dep=transactionId +"  Amount of "+amount+" is deposited:      "+acc1.getBalance();
		acc1.getTransaction().add(dep);
		return true;
	}




	public boolean withdrawAmount(double amount) {
		if(acc1.getBalance()>=amount)
		{
		acc1.setBalance(acc1.getBalance()-amount);
		String with=transactionId +"  Amount of "+amount+" is withdrawn:      "+acc1.getBalance();
		acc1.getTransaction().add(with);
		return true;
		}
		else
		{
			return false;
		}
	}


public boolean loginAccount(String username,String password) {

		for(String key : map.keySet())
		{
			acc1=map.get(key);
			
			if( acc1.getCustomer().getUsername().equals(username) &&( acc1.getCustomer().getPassword().equals(password)));
			{
				return true;
			}
		}
		return false;
		
	}


	public boolean fundTransfer(long accountNo,double amount) {

			
		
			
			//if(acc1.getBalance()>=amount && accountNo != acc1.getAccountNo()) {
				for(String key : map.keySet())
				{
					Account recieverAccount = map.get(key);
					if(recieverAccount.getAccountNo()==accountNo)
					{
						recieverAccount.setBalance(recieverAccount.getBalance()+amount);
						acc1.setBalance(acc1.getBalance()-amount);
						String transfer=transactionId +"  Amount of "+amount+" is transferred:      "+acc1.getBalance();
						acc1.getTransaction().add(transfer);
						return true;
					}
				}
				return false;
			}
			//else {
		//		return false;
		//	}
	
		/*for(String key : map.keySet())
			{
				Account ac1 = map.get(key);
				if(ac1.getAccountNo()==accountNo)
				{
					ac1.setBalance(ac1.getBalance()+amount);
					System.out.println(ac1);
					acc1.setBalance(acc1.getBalance()-amount);
					System.out.println(acc1);
					
				}
				
				else {
			return false;
		}
			}
			return true;
	}
	*/
	

		
  



	public List<String> printTransaction() {
		return acc1.getTransaction();

		}




	}




/*


	
	static Account account;
	
	static HashMap<String,Account> map = new HashMap<String,Account>();



			
	
		
		public boolean addAccount(Account account){
			map.put(account.getCustomer().getUsername(), account);
			
			map.put(account.getBalance(), account);
			System.out.println(map);
			
			return true;
		}
		public float showBalance() {
			
				return account.getBalance();
			}

			
			public boolean depositAmount(float amount) {
				
				
						account.setBalance(account.getBalance()+amount);
				
				return true;
			}

		
			public boolean withdrawAmount(float amount) {
				
				
					
						if(account.getBalance() >= (amount+500))
						{
							account.setBalance(account.getBalance()-amount);
							return true;
						}
						else
						{
							System.out.println("Minimum Balance Violation");
						}
						return false;
				
				
			}

			public boolean loginAccount(String username, String password) {
				
				for(String key : map.keySet())
				{
					account = map.get(key);
					if( account.getCustomer().getUsername().equals(username) && account.getCustomer().getPassword().equals(password))
					{
						return true;
					}
				}
				return false;
				
				
			}
			


		public boolean fundTransfer(int accountNo, float amount) {
			if(account.getBalance()>=amount && accountNo!=account.getAccountNo()) {
				for(String key : map.keySet())
				{
					
					Account ac =  map.get(key);
				
					if(ac.getAccountNo()==accountNo)
					{
						ac.setBalance(ac.getBalance()+amount);
						account.setBalance(account.getBalance()-amount);
						return true;
					}
				}
			return false;
			}
			else {
					return false;
				}	
			
			}
			
		
			public List<String> printTransaction() {
				// TODO Auto-generated method stub
				System.out.println(account);
				
			}

			

		}
		
*/