package com.thread;

public class Lata_sleep_Thread {

	public static void main(String[] args)  {
//		craete thread
		Thread loop= new Thread(()->
		{
			for( int i =0 ;i<6;i++) {
				System.out.println("hello alll");
	                try {
	                    Thread.sleep(3000); // pause 1 second between prints
	                } catch (InterruptedException e) 
	                {e.getMessage();}
			     }
		});
		
	loop.start();
			
		
		

	}

}
