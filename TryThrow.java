
public class TryThrow {

	public static void main(String[] args) {
		System.out.println("Hello");
		try {
			System.out.println(10/0);
		}
		
		catch(Exception A) {
			A.printStackTrace();
			System.out.println("Caught");
		}
		
		System.out.println("Bye");
		

	}

}
