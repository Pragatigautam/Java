
public class Arrayyy {

	public static void main(String[] args) {
		//Program 1 print every integer element in the array
		int[] num = new int [6];
		num [0] = 100;
		num [1] = 200;
		num [2] = 300;
		num [3] = 400;
		num [4] = 500; 
		num [5] = 600;
		
		
		
		
		
		
		System.out.println(num[0]);
		System.out.println(num[1]);
		System.out.println(num[2]);
		System.out.println(num[3]);
		System.out.println(num[4]);
		
		int number [] = {111,222,333,444,555};
		System.out.println(number[0]);
		System.out.println(number[1]);
		System.out.println(number[2]);
		System.out.println(number[3]);
		System.out.println(number[4]);
		
		//program 2 print every string element in the array
		String [] cities = new String [5];
		
		 cities [0] = "Kathmandu";
		 cities [1] = "Bhaktapur";
		 cities [2] = "Lalitpur";
		 cities [3] = "Biratnagar";
		 cities [4] = "Birganj";
		 
		 System.out.println(cities[0]);
		 System.out.println(cities[1]);
		 System.out.println(cities[2]);
		 System.out.println(cities[3]);
		 System.out.println(cities[4]);
		 
		 //program 3 using for loop print every integer element of Array
		 int number1[] = {101, 202, 303, 404, 505};
		 for (int i=0; i<6; i++) {
			 System.out.println(number1[i]);
		 }
		 
		 //program 4 {do program 3 in reverse}
		 for(int i=number1.length-1; i>=0; i--) {
			 System.out.println(number1[i]);
		 }
		 
		 //program 5 while loop
		 
		 int number2 [] = {122, 133, 144, 155, 166};
		 int i1=0;
		 while (i1 < number2.length) {
			 System.out.println(number2[i1]);
			 i1++;
		 }
		 
		 //program 6 in reverse p5
		 
		 int i2= number2.length-1;
		 while (i2>=0) {
			 System.out.println(number2[i2]);
			 i2--;
			 
		 }
		 
		 //program 7 {for each loop}
		 String [] fruits = {"apple", "orange", "banana", "watermalon", "mango"};
		 for (String a: fruits) {
		 System.out.println(a);
		 }
		 
		 //program 7 {for each loop for int}
		 int [] number3 = {900, 800, 700, 600, 500};
		 for (int b: number3) {
		 System.out.println(b);
		 }
		 
		 
		 
		 
		 
		
		
		
		
		

	
	}

}
