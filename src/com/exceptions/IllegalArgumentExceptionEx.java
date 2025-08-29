package com.exceptions;

import java.util.Scanner;

public class IllegalArgumentExceptionEx {

//	create age method
	public static int setAge(int age) 
	{
		if (age<0) {
// for throw use new keyword and what exception(pass message)			
			throw new IllegalArgumentException("age cannot be negative");
					}
		else return age;
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter age ");
		int age =sc.nextInt();
		
//		calling 
		System.out.println("age : "+setAge(age));
	}

}
