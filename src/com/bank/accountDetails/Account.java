package com.bank.accountDetails;

/**
 * @author Mohamed
 *
 */
public class Account {

	protected int acctNum;
	protected String acctType;
	protected String acctHolder;
	protected String dateOpening;
	protected int balance;

	public Account() {
		super();
	}

	public Account(int acctNum, String acctType, String acctHolder, String dateOpening, int balance) {
		super();
		this.acctNum = acctNum;
		this.acctType = acctType;
		this.acctHolder = acctHolder;
		this.dateOpening = dateOpening;
		this.balance = balance;
	}

	public int getAcctNum() {
		return acctNum;
	}

	public void setAcctNum(int acctNum) {
		this.acctNum = acctNum;
	}

	public String getAcctType() {
		return acctType;
	}

	public void setAcctType(String acctType) {
		this.acctType = acctType;
	}

	public String getAcctHolder() {
		return acctHolder;
	}

	public void setAcctHolder(String acctHolder) {
		this.acctHolder = acctHolder;
	}

	public String getDateOpening() {
		return dateOpening;
	}

	public void setDateOpening(String dateOpening) {
		this.dateOpening = dateOpening;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

}
