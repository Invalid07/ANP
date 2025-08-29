package com.exceptions;

import java.util.Scanner;

public class ArrayOutBound {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();
        int[] arr = new int[n];

        // Inserting values
        System.out.println("Enter " + n + " integers:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

//        display arr value
        for(int i=0; i<arr.length;i++) 
        {
        	System.out.println(i+"array values are :"+arr[i]);
        }
        
        
//        try catch
       int access=Integer.MAX_VALUE;
        try {
            System.out.println("\nto access?");
           access = sc.nextInt();
            System.out.println("Element at index " + access + ": " + arr[access]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Oops! Index " + access + " is out of bounds.");
        }
    }
}
