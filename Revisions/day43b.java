package Revisions;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class day43b {

	public static void main(String[] args) {
		

		try {
			FileReader reader = new FileReader("info.txt");
			BufferedReader bufferReader = new BufferedReader(reader);
			//String line;
			
			try {

				
				String line = bufferReader.readLine();
				 
				while(line != null) {
					System.out.println(line);
					line =  bufferReader.readLine();
				}
				

			    bufferReader.close();
				
				
				
			} catch (IOException e) {
				
				e.printStackTrace();
			}
			
		} 
		
		
		catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
		
		
		
	}

}