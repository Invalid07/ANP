package com.corejava;

public class AdditionMain {

	public static void main(String[] args) {
	Addition sum = new Addition();
	
//	call method 2 
	System.out.println("method with 2 parameter: "+sum.add(3,4)+"\nmethod with 3 parameter:  "+sum.add(3,4,3)+"\nwith double"+sum.add(3.3,4.5,3.5));

	}

}
