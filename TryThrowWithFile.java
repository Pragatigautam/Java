import java.io.FileWriter;
import java.io.IOException;

public class TryThrowWithFile {

	public static void main(String[] args) {
	
		
		try {
			FileWriter abc = new FileWriter ("info.txt", true) ;
			System.out.println(10/0);
			abc.write("Hello world");
			abc.write("\n");
			abc.close();
		}
		
		catch(IOException B) {
			B.printStackTrace();
		}
		
		catch(ArithmeticException C) {
			C.printStackTrace();
			System.out.println(C.getMessage());
		}
		

	}

}
