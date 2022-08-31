package com.Java.SystemDesign;
import java.util.*;
public class Bank {

	
	 Map<Integer,Long> bankAccountMap = new HashMap<Integer,Long>();
	    int count =1;
	    
	    public Bank(long[] balance) {
	        for(long b:balance)
	        bankAccountMap.put(count++,b);
	    }
	    
	    public boolean transfer(int account1, int account2, long money) {
	        if(bankAccountMap.containsKey(account1) && bankAccountMap.containsKey(account2)){
	           if(bankAccountMap.get(account1)>=money){
	               bankAccountMap.put(account1,bankAccountMap.getOrDefault(account1,0L)-money);
	                bankAccountMap.put(account2,bankAccountMap.getOrDefault(account2,0L)+money);
	                  return true;
	           }else{
	               return false;
	           }
	        }
	        return true;
	        
	    }
	    
	    public boolean deposit(int account, long money) {
	        if(bankAccountMap.containsKey(account)){
	            bankAccountMap.put(account,bankAccountMap.getOrDefault(account,0L)+money);
	             return true;
	        }
	       return false;
	    }
	    
	    public boolean withdraw(int account, long money) {
	         if(bankAccountMap.containsKey(account)){
	             if(bankAccountMap.get(account)>=money){
	                 bankAccountMap.put(account,bankAccountMap.getOrDefault(account,0L)-money);
	                  return true;
	             }else{
	                 return false;
	             }
	         }
	        return false;
	             
	    }
	    
	    public static void main(String args[]) {
	    	long num[]= {10,100,20,50,30};
	    	Bank bank = new Bank(num);
	    	System.out.println(bank.withdraw(3, 10));
	    	System.out.println(bank.transfer(5, 1, 20)); // return true, account 5 has a balance of $30, so it is valid to transfer $20.
            // Account 5 has $30 - $20 = $10, and account 1 has $10 + $20 = $30.
	    	System.out.println(bank.deposit(5, 20));     // return true, it is valid to deposit $20 to account 5.
            // Account 5 has $10 + $20 = $30.
	    	System.out.println(bank.transfer(3, 4, 15)); // return false, the current balance of account 3 is $10,
            // so it is invalid to transfer $15 from it.
	    	System.out.println(bank.withdraw(10, 50));   // return false, it is invalid because account 10 does not exist.
	    	
	    }
}
