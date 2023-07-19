
public class ForTheExam {

	public static void main(String[] args) {
		// function for addition of two numbers
		calculator(17, 9);

		// arithmetic operation of two variables
		int x = 50;
		int y = 10;
		System.out.println(x + y);
		System.out.println(x - y);
		System.out.println(x * y);
		System.out.println(x / y);
		System.out.println(x % y);

		// greatest of three variables
		int i = 90;
		int j = 50;
		int k = 100;
		if (i > j && i > k) {
			System.out.println("i is greatest");
		} else if (j > i && j > k) {
			System.out.println("j is greatest");
		} else {
			System.out.println("k is greatest");
		}

		// switch case program for city and state
		String city = "kathmandu";
		switch (city) {
		case "irving":
			System.out.println("TX");
			break;
		case "boston":
			System.out.println("MA");
			break;
		case "Denver":
			System.out.println("CO");
		default:
			System.out.println("incorrect city name");

		}

	}

	public static void calculator(int a, int b) {
		System.out.println(a + b);

	}
}
