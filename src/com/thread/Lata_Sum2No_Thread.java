package com.thread;

import java.util.Scanner;

public class Lata_Sum2No_Thread {
	static int one;
	static int two;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		Thread t1 = new Thread(()->{
			System.out.println(" enter no");
			  one = sc.nextInt();
			});
		
		Thread t2 = new Thread(()->{
			System.out.println(" enter no");
			two = sc.nextInt();
			int result =one +two;
			System.out.println("resukt : "+result);
			});
	
		try {
			t1.start();
			t1.join();
			
			t2.start();
			t2.join();
		}catch(InterruptedException ne) {
			ne.getMessage();
		}
		
		
	
	}

}
