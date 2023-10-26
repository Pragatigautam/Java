package two;

public class Aug20Exam8 {

	public static void main(String[] args) {
		System.out.println("Hello");
		try {
			System.out.println(100/0);
		}
		catch (ArithmeticException A) {
			System.out.println("You cannot divide 100 by 0.");
		}
		System.out.println("Bye");
		
		

	}

}
