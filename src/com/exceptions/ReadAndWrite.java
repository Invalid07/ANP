package com.exceptions;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReadAndWrite {

    public static void main(String[] args) {

        // Try-with-resources ensures the reader is closed automatically
        try (BufferedReader reader = new BufferedReader(
                new FileReader("C:\\Users\\Vikas\\OneDrive\\Documents\\dc_4_vikas.docx"))) 
        {
            StringBuilder content = new StringBuilder(); // Holds full file content
            String line;

            // Read the entire file line by line
            while ((line = reader.readLine()) != null) 
            {
                content.append(line).append(System.lineSeparator());
            }

            // Print the entire content
            System.out.print(content.toString());

            // Append a line to the same file
            try (BufferedWriter writer = new BufferedWriter(
                    new FileWriter("C:\\Users\\Vikas\\OneDrive\\Documents\\dc_4_vikas.docx", true))
            ) {
                writer.write("this is an Exception File");
                writer.newLine();
            }

            System.out.println("Appended after reading the file");

        } catch (IOException e) {
            // Print error details
            e.printStackTrace();
        }

    }
}