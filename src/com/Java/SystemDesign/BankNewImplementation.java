package com.Java.SystemDesign;

public class BankNewImplementation {
	long[] balance;
	int n;
	public BankNewImplementation(long[] balance) {
		n = balance.length;
		this.balance = new long[n];
		for(int i=0;i<balance.length;i++) {
			this.balance[i]=balance[i];
		}
	}

	   public boolean deposit(int account, long money) {
	       if(account<n) {
	    	   balance[account-1] = balance[account-1]+money;
	    	   return true;
	       }
	       return false;
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
