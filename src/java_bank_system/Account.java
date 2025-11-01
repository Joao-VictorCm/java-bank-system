package java_bank_system;

public class Account {
	
	private int accountNumber;
	public String name;
	public double balance; 
	public double deposit;
	public double sake;
	
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
	
	


}
