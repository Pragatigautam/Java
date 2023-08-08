package two;

public class ExceptionHandlingP5 {

	public static void main(String[] args) {
		System.out.println("I am Pragati");
		
		try {
			System.out.println(100/0);
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
			
		}
		finally {
			System.out.println("I will always be printed");
		}

	}

}
