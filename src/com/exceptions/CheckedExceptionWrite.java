package com.exceptions;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class CheckedExceptionWrite {

	public static void main(String[] args) {
		  // APPEND A LINE TO THE FILE
        try (BufferedWriter writer = new BufferedWriter(
                new FileWriter("C:\\Users\\Vikas\\OneDrive\\Documents\\dc_4_vikas.docx", true)
            )) {
            writer.write("This is an exception");
            writer.newLine();
            System.out.println("Appended text successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred during writing: " + e.getMessage());
        }
	}

}


/*
 
----------------------------------------------------read-----------------------------------------
  try (BufferedReader read = new BufferedReader( new FileReader("C:\\Users\\Vikas\\OneDrive\\Documents\\dc_4_vikas.docx"))) 
  {
            StringBuilder content = new StringBuilder();
            String line;
            while ((line = read.readLine()) != null) {
                content.append(line).append(System.lineSeparator());
            }
            System.out.println(content.toString());

        } catch (IOException ioe) {
            System.out.println("An error occurred: " + ioe.getMessage());
        }





-------------------------------write-------------------------------------------------

 try (BufferedWriter writer = new BufferedWriter(
                new FileWriter("C:\\Users\\Vikas\\OneDrive\\Documents\\dc_4_vikas.docx", true))
        ) {
            writer.write("this is an exception");
            writer.newLine();
            System.out.println("Line appended successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred while writing: " + e.getMessage());
        }














































*/