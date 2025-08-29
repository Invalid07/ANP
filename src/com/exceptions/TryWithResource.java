package com.exceptions;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TryWithResource {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			//may throw IOException (Checked Exception)
			//This is called as Try-with Resource
			BufferedReader br = new BufferedReader(new FileReader(" "));
			String read = br.readLine();
			System.out.println(read);
			br.close();
		}
		catch(IOException ioe)
		{
			System.out.println("An error occured "+ioe.getMessage());
		}
		



	}

}
