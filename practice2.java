
public class practice2 {

	public static void main(String[] args) {
		// simple arithmetic operation
		int a = 5;
		int b = 10;
		System.out.println(a + b);
		System.out.println(b - a);
		System.out.println(a * b);
		System.out.println(b / a);
		System.out.println(b % a);

		calcu(10, 5);

	}

	// creating function
	public static void calcu(int a,int b) {
		System.out.println(a+b);
		System.out.println(b-a);
		System.out.println(a*b);
		System.out.println(b/a);
		System.out.println(b%a);
		
		
		//practice for conditions (if)
		int a1=10;
		int a2=100;
		System.out.println(a1>a2);
		System.out.println(a2==a1);
		System.out.println(a2!=a1);
		System.out.println(a2<a1 || a2<6);
		
		
		// discount using  if statement
		int t=100;
		if (t>0 && t<=5) {
			System.out.println("discount is 10%");
		}
		if (t>5 && t<=10) {
			System.out.println("discount is 20%");
		}
		if(t>10) {
			System.out.println("discount is 30%");
		}
		
		//grade using else if
		
		int grade=45;
		if (grade<=90 && grade>=80) {
			System.out.println("grade A");
		}
		else if (grade<80 && grade>=70) {
			System.out.println("grade B");
		}
		else if (grade<70 && grade>=60) {
			System.out.println("grade c");
		}
		else {
			System.out.println("fail");
		}
		
		//greatest among 3 numbers
		int p=13;
		int q=67;
		int r=46;
		if (p>q && p>r) {
			System.out.println("p is the greatest");
		}
		else if (q>p && q>r){
			System.out.println("q is the greatest");
		}
		else {
			System.out.println("r is the greatest");
		}
		
		//switch statement for city and state (without break so it will print all the states
		String city=("irving");
		switch (city) {
		case "irving":
				System.out.println("TX");
		case "LA":
			System.out.println("CA");
		default:
			System.out.println("invalid input");
		
		}
		
		//switch statement for city and state (with break)
		String city2=("ktm");
		switch (city) {
		case "ktm":
		case "bhaktapur":
		case "lalitpur":
			System.out.println("nepal");
			break;
		case "Dallas":
		case "New York":
		case "Boston":
			System.out.println("USA");
			break;
		case "tokyo":
		case "osaka":
		case "kobe":
			System.out.println("Japan");
			break;
			default:
				System.out.println("invalid city name");
		}
		
		// for loop print 1 to 5
		for (int i=1; i<=5; i++){
			System.out.println(i);
		}
		
		//print table of 5 in reverse
		
		for (int i=50; i>=5; i=i-5) {
			System.out.println(i);
		}
		
//		// print table of 3 but break at 27
//		
		for (int i=3; i<=30; i=i+3) {
			if(i==27)
				break;
			System.out.println(i);
		}
		
		//1 to 10 break after 9
		
		for (int i=1; i<=10; i++) {
			if (i==9)
			   break;
			System.out.println(i);
			
			
		}
		
		//while loop print 1 to 10
		
		int i=1;
		while (i<=10){
			System.out.println(i);
			i++;
		}
		
		//while loop for table of 3
		
		int i1=3;
		while (i1<=30){
			System.out.println(i1);
			i1=i1+3;
			
		}
		
		//while loop for table of 5 but skip 15
		
		int i2=5;
		while (i2<=50){
			
			if (i2==15) {
				i2=i2+5;
			
			continue;
			}
			System.out.println(i2);
			i2=i2+5;
			
		}
		
		//while loop for table of 10 reverse but skip 60
		
		int i3=100;
		while (i3>=10){
			if (i3==60) {
				i3=i3-10;
				continue;
			}
			System.out.println(i3);
			i3=i3-10;
		}
		
		
		
		String Opname = "biplov";
		String ucName = Opname.toUpperCase();
		String ucRev ="";
		for (int i11 = 0; i11<ucName.length(); i11++) {
			ucRev = ucRev + ucName.charAt(i11);
		}
		System.out.println(ucRev);
		
		
		String mother = "bishnudevi";
		String motherr = mother.substring(2,6);
		System.out.println(motherr);
		
		
		
	
			
			
		
		
		
		
		
		
		
		
		
			
			
			
			
			
		
		
			
		
	}

}
