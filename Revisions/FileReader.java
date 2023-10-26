package Revisions;

import java.io.FileWriter;

public class FileReader {

	public static void main(String[] args) {
		
		String fileName = "info.txt";
		
		try {
		
		FileWriter Pragati = new FileWriter(fileName);
		Pragati.write("Hello");
		Pragati.write("\n");
		Pragati.write("Bye");
		Pragati.close();
		System.out.println("successfully written");
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
		
		


	}

}
