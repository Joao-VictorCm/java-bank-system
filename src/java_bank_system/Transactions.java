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
		
		System.out.print("Is there na initial deposit (y/n)?");
		char depositInitalAccount = sc.next().charAt(0);
		if (depositInitalAccount == 'y') {
			System.out.print("Enter initial deposit value:");
			account.deposit = sc.nextDouble();
			account.balance = account.deposit;
		}else {
			account.balance = 0;
		}
		
		System.out.println(account.balance);
		
		
		

		
		sc.close();
	}

}
