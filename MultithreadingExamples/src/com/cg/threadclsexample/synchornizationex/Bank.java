package com.cg.threadclsexample.synchornizationex;

public class Bank {
	
	public static final int MAX_ACCOUNT = 10;
	public static final int MAX_AMOUNT = 10;
	public static final int INITIAL_BALANCE = 100;
	
	private Account[] accounts = new Account[MAX_ACCOUNT] ;
	
	public Bank() {
		for (int i = 0; i < accounts.length; i++) {
			 accounts[i] = new Account(INITIAL_BALANCE);
			
		}
	}
	
	/*
	 * public void transfer(int from,int to,int amount) { if(amount <=
	 * accounts[from].getBalance()) { accounts[from].withDraw(amount);
	 * accounts[to].deposit(amount);
	 * 
	 * String message = "%s trasferred %d from %s to %s . Total balance: %d \n";
	 * String threadname = Thread.currentThread().getName();
	 * System.out.printf(message,threadname,amount,from,to,getTotalBalance()); } }
	 */
	
	public synchronized void transfer(int from,int to,int amount) {
	try {
		while(accounts[from].getBalance() < amount) {
			wait();
		}
			accounts[from].withDraw(amount);
			accounts[to].deposit(amount);
			
			String message = "%s trasferred %d from %s to %s . Total balance: %d \n";
			String threadname = Thread.currentThread().getName();
			System.out.printf(message,threadname,amount,from,to,getTotalBalance());
			
			notifyAll();
		}catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	private Object getTotalBalance() {
		int total =0;
		for(int i=0;i<accounts.length;i++) {
			total += accounts[i].getBalance();
		}
		return total;
	}
}
