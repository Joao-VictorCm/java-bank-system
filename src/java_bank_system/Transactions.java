package java_bank_system;

import java.util.Scanner;

public class Transactions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter account number:");
		int accountNumber = sc.nextInt();
		System.out.print("Enter account holder:");
		String name = sc.next();
		
		Account account = new Account(accountNumber, name);
		account.setAccountNumber(accountNumber);
		
		
		System.out.print("Is there na initial deposit (y/n)?");
		char depositInitalAccount = sc.next().charAt(0);
		if (depositInitalAccount == 'y') {
			System.out.print("Enter initial deposit value:");
			account.depositInt = sc.nextDouble();
			account.setBalance(account.depositInt);
		}else {
			account.setBalance(0);
		} 
		
		System.out.print("\nAccount data:");
		System.out.println("\nAccount " +account.getAccountNumber()+ ", Holder: " + name+ ", Balance: "+account.getBalance()+"\n");
		
		
		//Deposit
		System.out.print("Enter a deposit value: ");
		account.deposit = sc.nextDouble();
		account.setBalance(account.balance + account.deposit);
		System.out.print("Updated account data:");
		System.out.println("Account " +account.getAccountNumber()+ ", Holder: " + name+ ", Balance: "+account.getBalance()+"\n");
		
		
		//withdraw
		System.out.print("Enter a withdraw value:");
		account.withdraw = sc.nextDouble();
		account.setBalance(account.balance - account.withdraw - account.taxWithdraw);
		
		System.out.print("Updated account data:");
		System.out.println("Account " +account.getAccountNumber()+ ", Holder: " + name+ ", Balance: "+account.getBalance()+"\n");
		

		
		sc.close();
	}

}
