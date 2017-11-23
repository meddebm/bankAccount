package com.bank.accountService;

import java.math.BigDecimal;

import com.bank.accountDetails.Account;

/**
 * @author Mohamed
 *
 */
public class AccountService extends Account {

	public AccountService(int number, String type, int amnt, String clientId,String date) {

		acctNum = number;
		acctType= type;
		acctHolder= clientId;
		dateOpening=date;
		balance=amnt;
	}
	AccountService(){
		super();
	}
	
	public void createAccount(int number, String type, int amnt, String clientId,String date) {
		
		new AccountService(number,type,amnt,clientId,date);
	}
	
	public void deposit(String actNum,int amount) {
		balance= balance+amount;
	}
	
	public int withdraw(int actNum, int amount) {
		balance=balance-amount;
		return balance;
	}
	
	public void accountDetails(){
        System.out.println("Depositor Name :" +acctHolder);
        System.out.println("Account Number : "+acctNum);
        System.out.println("Account Balance : "+balance);
        System.out.println("Account Type : "+acctType);
        System.out.println("Account Opening Date : "+dateOpening);
    }
}
