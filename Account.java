package basic;

import java.util.Arrays;

public class Account  {
	
	KYCVerification kycdetails;
	ContactDetails contactDetails;
	
	private long accountNumber;
	private String username;
	private String password;
	private int balance;
	private int cashback;
	
	Account arr[] = new Account[5];
	int indexPosition =0;
	
	public Account(){
		
	}
	
	public Account(long accountNumber, String username, String password, int balance) {
		super();
		this.accountNumber = accountNumber;
		this.username = username;
		this.password = password;
		this.balance = balance;
		
	}
	
	
	
	
	public long getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public int getCashback() {
		return cashback;
	}

	public void setCashback(int cashback) {
		this.cashback = cashback;
	}

	@Override
	public String toString() {
		return "Account [accountNumber=" + accountNumber + ", username=" + username + ", password=" + password
				+ ", balance=" + balance + ", cashback=" + cashback + "]";
	}
	
	

	
	

}
