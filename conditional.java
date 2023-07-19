
public class conditional {

	// Program 1 //conditional is used when you have multiple output for one input
	public static void main(String[] args) {
		int ticketN = 9;

		if (ticketN > 0 && ticketN <= 5) {
			System.out.println("discount is 10%");
		}
		if (ticketN > 5 && ticketN <= 10) {
			System.out.println("discount is 20%");
		}
		if (ticketN > 10) {
			System.out.println("discount is 30%");
		}

		// Program 2

		int ticketNo = 40;
		if (ticketNo > 0 && ticketNo <= 5) {
			System.out.println("discount is 10%");

		} else if (ticketNo > 5 && ticketNo <= 10) {
			System.out.println("discount is 20%");

		} else if (ticketNo > 10) {
			System.out.println("discount is 30%");

		} else {
			System.out.println("error");

		}
		
		//program 3
		int marks =99;
		if (marks>90) {
			System.out.println("grade A");
			
			
		}
		else if (marks>75) {
			System.out.println("grade B");
		}
		else if (marks>60) {
			System.out.println("grade c");
		}
		
		// program 4
		int marksB= 88;
		if (marksB>90) {
			System.out.println("grade a");
		}
		else if (marksB>75) {
			System.out.println("grade B");
		}
		else if (marks>60) {
			System.out.println("grade c");
		}
		else {
			System.out.println("fail try again");
		}
		
		//program 5
		int a = 100;
		int b = 20;
		if (a>b) {
			System.out.println("a is greater than b");
		}
		else {
			System.out.println("b is greater than a");
		}
		
		//program 6
		int x = 12;
		int y = 15;
		int z = 19;
		if (x>y && x>z) {
			System.out.println("x is greater");
		}
		else if (y>x && y>z) {
			System.out.println("y is greater");
		}
		else {
			System.out.println("z is greater");
		}
				
		
			
		
	}

}
