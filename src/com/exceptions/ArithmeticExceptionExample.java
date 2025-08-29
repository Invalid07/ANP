package com.exceptions;

import java.util.Scanner;

public class ArithmeticExceptionExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        try {
            System.out.println("Enter numerator:");
            int num = sc.nextInt();
            System.out.println("Enter denominator:");
            int den = sc.nextInt();
            int result = num % den;
            System.out.println("Result: " + result);
        } catch (ArithmeticException ae) {
            System.out.println(ae.getMessage());
        }
    }
}