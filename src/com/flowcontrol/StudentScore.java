package com.flowcontrol;

import java.util.Scanner;

public class StudentScore {
	static  Scanner sc = new Scanner(System.in);
	
	public static void score(int marks) 
	{
			 if (marks < 0) {
	            throw new IllegalArgumentException("marks cannot be negative");
	        } else if (marks == 90 || marks == 100) {
	            System.out.println("GRADE A");
	        } else if (marks == 80 || marks == 89) {
	            System.out.println("GRADE B");
	        } else if (marks == 70 || marks == 79) {
	            System.out.println("GRADE C");
	        } else if (marks == 60 || marks == 69) {
	            System.out.println("GRADE D");
	        } else {
	            System.out.println("GRADE F");
	        }
	}

    public static void main(String[] args) 
    {
    	 System.out.println("enter your marks");
	        int marks = sc.nextInt();
	        score( marks);
       
    }
}