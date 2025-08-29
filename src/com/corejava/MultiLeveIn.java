package com.corejava;


//parent calss
 class MultiLeveIn 
 {
   void engin() {
	   System.out.println("engin started ");
   }
}

 
// chid but parent 
 class bike extends MultiLeveIn {
	 void kickstarted() {
		 System.out.println("bike strated by kick strat");
	 }
 }
 
// only child 
 class sportbik extends bike {
	 void selfstrat() {
		 System.out.println("self strad bike ");
	 }
 }