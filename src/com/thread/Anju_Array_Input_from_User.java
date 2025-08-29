package com.thread;

import java.util.Scanner;

public class Anju_Array_Input_from_User {

    static int[] arr;
    static int sum1 = 0;
    static int sum2 = 0;
    static int result;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your array size: ");
        int n = sc.nextInt();

        arr = new int[n]; 

        //  Inserting value
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt(); 
        }

        //  Thread first half
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < arr.length / 2; i++) {
                sum1 += arr[i];
            }
        });

        //Thread second half
        Thread t2 = new Thread(() -> {
            for (int i = arr.length / 2; i < arr.length; i++) {
                sum2 += arr[i];
            }
        });

        try {
            t1.start();
            t1.join(); 
            t2.start();
            t2.join(); 
            
            result = sum1 + sum2;
            System.out.println("Result: " + result);
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted: " + e.getMessage());
        }

      
    }
}