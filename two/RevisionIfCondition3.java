package two;

public class RevisionIfCondition3 {

	public static void main(String[] args) {
		int num1= 4;
		int num2=6;
		
		if (num1>num2){
			System.out.println("num1 is greater");
		}
		else {
			System.out.println("num2 is greater");
		}
		
		//ticket is more than 10 the 
		int ticket = 2;
		if (ticket>5 && ticket<10) {
			System.out.println("you get 10% discount");
		}else if (ticket>10 && ticket<20) {
			System.out.println("you get 20% discount");
		}else if (ticket>20) {
			System.out.println("you get 30% discount");
		}else {
			System.out.println("you don't get a discount");
		}
		
		//ternary operator
		
		int a=10;
		String output = (a%2==0)?  "a is an even number": " a is an odd number";
		System.out.println(output);
		

	}

}
