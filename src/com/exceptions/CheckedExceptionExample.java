package com.exceptions;

import java.io.*;

public class CheckedExceptionExample {

    public static void main(String[] args) {
        // READ ENTIRE FILE
        try {
            BufferedReader reader = new BufferedReader(
                new FileReader("C:\\Users\\Vikas\\OneDrive\\Documents\\dc_4_vikas.docx")
            );
            StringBuilder content = new StringBuilder();
            String line;

            while ((line = reader.readLine()) != null) {
                content.append(line).append(System.lineSeparator());
            }

            reader.close(); // Good practice to close reader
            System.out.println("File Content:\n" + content);

        } catch (IOException ioe) {
            System.out.println("An error occurred during reading: " + ioe.getMessage());
        }

      
    }
}


/*
package com.exceptions;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

public class CheckedExceptionExample {

	public static void main(String[] args)
	{
	/*	try 
		{
//			may throw I/OException (Check Exception)
			BufferedReader br = new BufferedReader(new FileReader();
			String read = br.readLine();	
			System.out.println(read);
		}
		catch(IOException ioe) 
		{
				System.out.println("an error occure "+ioe.getMessage());
		}
		*/
		
		
		
//		-----------------------------------------read or display entiery file ---------------------------------------------------------------------
		
		try (BufferedReader read = new BufferedReader(new FileReader("C:\Users\Vikas\OneDrive\Documents\dc_4_vikas.docx")));
			{StringBuilder content = new StringBuilder();
//			 read line 
			String line;
			while ((line=read.readLine())!=null )
			{
				content.append(line).append(System.lineSeparator());
			}
//			print whole content 
			System.out.println(content.toString());
			
			catch(IOException ioe) 
			{
					System.out.println("an error occure "+ioe.getMessage());
					
			}
//			---------------------------------------------------------------
//			append a line at the end 
			try (BufferedWriter writer= new BufferedWriter(new FileWryer("C:\Users\Vikas\OneDrive\Documents\dc_4_vikas.docx",true)))
			{
				Writer.write("this is an exception");
				writer.newLine();
			}
				System.out.println("append after reading line");
			
			catch(IOException e) 
			{
					e.setStackTrace();
					
			}
		}
	
		
		
		


	}
}

*/