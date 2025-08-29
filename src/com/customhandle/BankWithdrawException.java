package com.customhandle;
import java.util.Scanner;
 class BankWithdrawException extends Exception {

	public BankWithdrawException(String message) {
		super(message);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter yor balance");
		int balance=sc.nextInt();
		System.out.println("enter withdraw amount");
		int withdraw = sc.nextInt();
		
		int result ;
		try {
			if(withdraw>balance) {
				throw new BankWithdrawException("insuffent balance");
			}
			else {
//				result=balance-withdraw;
				System.out.println("your current balance is : "+balance+"cr");
				System.out.println("withdraw successfuly "+"amount "+withdraw+" cr. 🤑"+"\nthx plz come 😊");
			}
		}
		
		catch(BankWithdrawException e) {
			System.out.println("plz try after some time🤐 or "+e.getMessage());
		}
	}

}
