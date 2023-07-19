package two;

public class RevisionArithmetics1 {

	public static void main(String[] args) {
		int a=9;
		int b=4;
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b);
		System.out.println(a%b);
		
		//calling function
		calculator (3,5);
		
		//calling function with no return type
		calc2();
		
		int e = clac3(5,6);
		System.out.println(e);
			
		

	}
	//creating the function
	public static void calculator(int a, int b) {
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b);
		System.out.println(a%b);
		}
		
	
	
	
		
	//function without parameter and return type
			public static void calc2() {
				System.out.println(2+4);
			}
			
	//function with parameter and return type
			public static int clac3(int a, int b) {
				System.out.println(a-b);
				return a-b;
			}
			

}
