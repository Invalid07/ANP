package com.flowcontrol;

import java.util.Scanner;

public class ReverseInteger {
//	print enteredd arr
	public static void display(int arr []) {
		System.out.print("arr you entered : ");
		for (int a:arr) 
		{
			System.out.println(a);
		}
	}
	
	
//	reverse array
	public static void reverse(int arr [] ) 
	{
		System.out.println("reversed array:");
		for (int i = arr.length - 1; i >= 0; i--) {
		    System.out.print(arr[i]);
		}
	}

	
	
//	main
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
//		enter array size 
		System.out.println("size of array");
		int size = sc.nextInt();
		int arr[]= new int[size];
		
//		insert inside the array 
		System.out.println("insert value ");
		for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
		
//       display 
	
		System.out.println("choose 1 : for dispaly array \nchooes 2 :reverse array ");
		int chooes=sc.nextInt();
		switch(chooes) 
		{
		case 1 :
			display(arr);
			break ;
		case 2 :
			reverse(arr);
			break ;
		default:
	        System.out.println(" oop!😁😁😁");

		
		}
		
			
		
	}

}
