package Revisions;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileReader0 {
	
	

	public static void main(String[] args) {
		
		try {
			FileReader reader = new FileReader("example.txt");
			BufferedReader bufferReader = new BufferedReader(reader);
			
			
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
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
		
		

	}

}
