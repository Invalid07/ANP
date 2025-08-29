package com.customhandle;

import java.util.Scanner;

public class InvaildAgeException extends Exception
{

	public InvaildAgeException(String message) {
		super(message);
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter age ");
		int age = sc.nextInt();
		try{ 
			if (age<=0) {throw new InvaildAgeException("not be zero or negative");
		     }else {
		    	 System.out.println("entered age :"+age);
		     }
     	}
		catch(InvaildAgeException e) {
			System.out.println("custom exception handling");
		}
		

	}

}
