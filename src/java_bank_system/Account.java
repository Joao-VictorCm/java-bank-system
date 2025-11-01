package java_bank_system;

public class Account {
	
	private int accountNumber;
	public String name;
	public double balance; 
	public double depositInt;
	public double deposit;
	public int taxWithdraw = 5;
	public double withdraw;
	
	public Account(int accountNumber, String name) {
		this.accountNumber = accountNumber;
		this.name = name;
	}
	
	public int getAccountNumber() {
		return accountNumber;
	}
	
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	


}
