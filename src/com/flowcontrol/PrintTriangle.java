package com.flowcontrol;

public class PrintTriangle {

    public static void main(String[] args) {
        // Number of rows for the triangle

        for (int i = 1; i <= 5; i++) //total line
        {
            for (int j = 1; j <= i; j++) //hori
            {
                System.out.print("*");
            }
            System.out.println(); 
        }
    }
}
