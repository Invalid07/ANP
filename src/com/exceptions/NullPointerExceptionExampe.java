package com.exceptions;

import java.util.Scanner;

public class NullPointerExceptionExampe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Scanner sc = new Scanner (System.in);
		String var1 = null;
		
		try {
			System.out.println("Enter tour name ");
//			 var1=sc.next();		
			System.out.println("your name is : "+var1.toUpperCase());
			}
		
		catch(Exception n) {
			System.out.println("name value can not be null");
		}
	}

}
