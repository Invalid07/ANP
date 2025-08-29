package com.flowcontrol;
import java.util.Scanner;

public class PrintTableWhileLoop {

	 public static void tabel(int num) {
		 int i = 1;
		 do {
			 System.out.println(num+"❌"+i+"➡️"+(num*i));
			 i++;
		 }
		 while(i<=10);
	 }
	
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Ask user for a number
        System.out.print("Enter a number  ");
        int num = sc.nextInt();

       tabel(num);

	       
	    }
	}


