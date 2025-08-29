package com.thread;

public class Lata3ThreadSolution extends Thread{


	    public void run() {
	        for (int i = 1; i <= 5; i++) {
	            System.out.println(Thread.currentThread().getName() + " - " + i);
	            try {
	                Thread.sleep(500); // pause for 0.5 seconds
	            } catch (InterruptedException e) {
	                e.printStackTrace();
	            }
	        }
	    }

	    public static void main(String[] args) {
	    	Lata3ThreadSolution t1 = new Lata3ThreadSolution();
	    	Lata3ThreadSolution t2 = new Lata3ThreadSolution();
	    	Lata3ThreadSolution t3 = new Lata3ThreadSolution();

	        t1.setName("Thread-1");
	        t2.setName("Thread-2");
	        t3.setName("Thread-3");
	         
	        t1.start();
	        t2.start();
	        t3.start();
	        
	        
	    }
	}

