
public class Hello{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hello");

		int x = 10;
		int y = 5;
		System.out.println(x + y);
		System.out.println(x - y);
		System.out.println(x * y);
		System.out.println(x / y);
		System.out.println(x % y);

		int a = 100;
		int b = 50;
		System.out.println(a + b);
		System.out.println(a - b);
		System.out.println(a * b);
		System.out.println(a / b);
		System.out.println(a % b);

// calling function that was created below

		Calculator(12, 16);
	}

	// creating function
	public static void Calculator(int a, int b) {
		System.out.println(a + b);
		System.out.println(a - b);
		System.out.println(a * b);
		System.out.println(a / b);
		System.out.println(a % b);
	}

}
