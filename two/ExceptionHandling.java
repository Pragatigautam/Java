package two;

public class ExceptionHandling {

	public static void main(String[] args) {
		try {
		System.out.println(12/2);
		System.out.println(12/0);
		}
		
		catch (ArithmeticException AE){
			System.out.println("12 by 0??? IDIOTTT!!!");
			
		}
		
		finally {
			System.out.println("I am just here to remind you I exist.");
		}
		

	}

}
