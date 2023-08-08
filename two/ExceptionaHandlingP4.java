package two;

public class ExceptionaHandlingP4 {

	public static void main(String[] args) {
		int []Arr2 = {100,200,300,400};
		try {
			System.out.println(Arr2[0]);
			System.out.println(Arr2[5]);
			System.out.println(5/0);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("This index doesn't exist");
		}
		catch(ArithmeticException e) {
			System.out.println("You cannot divide 5 by 0");
		}

	}

}
