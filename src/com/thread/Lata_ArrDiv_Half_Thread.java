package com.thread;

public class Lata_ArrDiv_Half_Thread {



	    static int arr[] = {2, 3, 4,0, 9};
	    static int sum1 = 0;
	    static int sum2 = 0;
        static int result;
	    public static void main(String[] args) {
	    	
	    	
	        Thread t1 = new Thread(() -> {
	            for (int i = 0; i < arr.length / 2; i++) {
	                sum1 += arr[i];
	            }
	        });

	        Thread t2 = new Thread(() -> {
	            for (int i = arr.length / 2; i < arr.length; i++) {
	                sum2 += arr[i];
	            }
	            result=sum1+sum2;
	            System.out.println("result : "+result);
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
