package two;

import java.io.FileWriter;
import java.io.IOException;

public class Aug20Exam10 {

	public static void main(String[] args) {
		
		String fileName = "ABC.txt";
		
		
		try {
			FileWriter writer = new FileWriter(fileName);
			writer.write("My name is Pragati gautam.");
			writer.write("\n");
			writer.write("I am learning Java");
			writer.write("\n");
			writer.write("This is Java test");
			writer.write("\n");
			writer.write("This is last line on the file.");
			writer.close();
			System.out.println("File has been written.");
		} catch (IOException e) {
			e.getMessage();
			e.printStackTrace();
		}

	}

}
