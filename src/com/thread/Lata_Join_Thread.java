package com.thread;

public class Lata_Join_Thread {

	public static void main(String [] args) {
		
//		first avg
		Thread Average = new Thread(()->
		{
			int sum =0;
			for(int i =1 ; i<=10;i++) 
			{
				sum=sum+i;
			}
			System.out.println("Average"+ sum/10.0);
		});
		
		
//		thread 2 
		Thread Square = new Thread(()->{
			int arr []= {1,2,3,4,5,7,8,9,10};
			for (int i : arr) {
			    int squareNum = i * i;
			    System.out.println(i + " square " + squareNum);
			}

			
		});
		
		
//		try catch 
		try {
//			1st start thraed and waite for other 
			Average.start();
			Average.join();
			
//				2st start thraed and waite for other 
			Square.start();
			Square.join();
		}catch(InterruptedException e){
			System.out.println(e.getMessage());
			
		}
	}
}
