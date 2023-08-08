package two;

public class ExceptionHandlingDay1 {

	public static void main(String[] args) {
		
		
		try {
			System.out.println("Hello");
			System.out.println(5/0);
			
			
		}
		
		catch (ArithmeticException e){
			System.out.println(e.getMessage());
			
		}
		System.out.println("Bye");

	}

}
