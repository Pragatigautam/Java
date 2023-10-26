package Revisions;

public class Exception01 {

	public static void main(String[] args) {
		
		System.out.println("Hello");
		
		try{
		System.out.println(100/0);
		}
		
		
		
		catch(Exception e) {
			e.getMessage();
			System.out.println("You cannot divide 100 by 0, its an arithmetic exception.");
		}
		
		System.out.println("Bye");

	}

}
