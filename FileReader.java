import java.io.FileWriter;
import java.io.IOException;

public class FileReader {

	public static void main(String[] args) {
		String fileName = "example.txt";
		
		try {
			FileWriter writer = new FileWriter(fileName);
			
			//Writing into the file
			
			writer.write("Hello world");
			writer.write("\n");
			writer.write("I am learning javascript.");
			writer.write("\n");
			writer.write("I am learing c#.");
			writer.write("\n");
			writer.write("I am learning java.");
			writer.write("\n");
			writer.write("I am learning flutter.");
			writer.close();
			System.out.println("Data successfully written and file is closed.");
			
		} catch (IOException e) {
			
			System.out.println(e.getMessage());
			
			e.printStackTrace();
		}

	}

}
