package Revisions;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriter09 {
	
	public static void main(String[] args) {
		
		String fileName = "Example.txt";
		
		try {
			FileWriter writer = new FileWriter(fileName);
			writer.write("First Line in the file.");
			writer.write("\n");
			writer.write("Second Line in the file.");
			writer.write("\n");
			writer.write("Third Line in the file.");
			writer.write("\n");
			writer.write("Fourth Line in the file.");
			writer.close();
			System.out.println("File has been written.");
			
			
		} catch (IOException e) {
			e.getMessage();
			e.printStackTrace();
		}
		
		
		
	}

}
