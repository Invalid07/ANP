package com.corejava;


abstract class ATM
{
	abstract void withdraw(double amt);
	void displBalance() 
	{
		System.out.println("balance is display");
	}
	
}

class SBI extends ATM
	{ 

	@Override
	void withdraw(double amt) 
	{
		System.out.println("  in sbi atm");
		
	}
}

	
class IBATM extends ATM
	{
		
		void withdraw(double amt) 
		{
			System.out.println(" in IBATM balance is display");			
		}
	}



public class Abstra {

	public static void main(String[] args) 
	{

		ATM a = new IBATM();
		a.withdraw(0);
	}

}


// if u have any one abstract method u have to make class as abstract class