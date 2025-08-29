package com.flowcontrol;

import java.util.Scanner;

public class Week {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
//	taking input from user 
	System.out.println("plz 😊choose your option :\n1➡️monday \n2➡️tuesday \n3➡️wednesday \n4➡️thursday \n5➡️friday \n6➡️saturday \n7➡️sunday");
	int choose = sc.nextInt();
	if (choose <= 0) {
        throw new IllegalArgumentException("marks cannot be negative");
    }else{
    	switch(choose) {
    	case 1:
    		System.out.println("maonday");
    		break;
    	case 2:
    		System.out.println("tuesday");
    		break;
    	case 3:
    		System.out.println("wednesday");
    		break;
    	case 4:
    		System.out.println("thursday");
    		break;
    	case 5:
    		System.out.println("friday");
    		break;
    	case 6:
    		System.out.println("saturday");
    		break;
    	case 7:
    		System.out.println("sunday");
    		break;
    		
    	default :
    		System.out.println("plz😭 check your option ");
    	}
	  }
	}

}
