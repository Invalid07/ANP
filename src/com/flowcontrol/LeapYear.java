package com.flowcontrol;

import java.util.Scanner;

public class LeapYear {
	
public static void leapYear(int year) {
	if (year<0 ) {
		throw new IllegalArgumentException("leap year cannot be negative");
	          }
	if(year==0) {
		throw new IllegalArgumentException("leap year cannot be zero");
	           }
	else {
		if (year % 4==0 || year % 400 ==0 || year %100!= 00) {
			System.out.println("leap eyaer 😎");
		}
	}

	
}

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
//		taking input from user
		System.out.println("please enter year 🙌");
		int year = sc.nextInt();
		
		leapYear(year);
	}

}
