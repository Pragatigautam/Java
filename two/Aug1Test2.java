package two;

public class Aug1Test2 {

	public static void main(String[] args) {
		try{
		System.out.println("Hello");
		System.out.println(5/0);
		}
		
		catch (ArithmeticException E){
			System.out.println("You cannot divide the whole number with 0");
			
		}
		finally {
			System.out.println("I always show up.");
		}

	}

}
