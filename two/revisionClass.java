package two;

public class revisionClass {

	public static void main(String[] args) {
		String name= "pragati";
		System.out.println(name);
		
		//character at i
		for (int i=0; i<name.length(); i++) {
			System.out.println(name.charAt(i));
		}
		
		//string to char and print every char for each loop
		for (char cc : name.toCharArray()) {
			System.out.println(cc);
		}
		
		//to uppercase
		String a = name.toUpperCase();{
			System.out.println(a);
			
		}

		
		
		
		
		
		
		
		
		
		String city2 = "gautam";
		String b = city2.toLowerCase();
		System.out.println(b);
		
		// Program 6
		
		String name2 = " lol ";
		System.out.println(name2.length());
		String c = name2.trim();
		System.out.println(c.length());
		
		// Program 7
		String name3 = "puppy";
		boolean d = name3.startsWith("p");
		System.out.println(d);
		
		// Program 8
		boolean e = name3.endsWith("y");
		System.out.println(e);
		
		// Program9
		String name4 = "I am pragati and pragati is my name";
		System.out.println(name4.replace("I", "j"));
		String name5 = name4.replaceAll("pragati", "mango");
		System.out.println(name5);
		String name6 = name4.replaceFirst("pragati","mango");
		System.out.println(name5);
		
		// Program 10
		
		String firstNameN = "chinmay";
		String lastNameL  = "deshpande";
		String fullName = firstNameN.concat(lastNameL);
		System.out.println(fullName);
		
		
		// program 11
		
		String city7 = "pune";
		String city8 = "pune";
		String city9 = "PUne";
		
		boolean g = city7.equals(city8);
		boolean h = city7.equalsIgnoreCase(city9);
		
		System.out.println(g);
		System.out.println(h);
		
		System.out.println(city7.contains("p"));
		System.out.println(city7.contains("pu"));
		
		String city10 = "I am learning js";
		
		String [] j = city10.split(" ");  // {"I","am","learning","js"};
		for(String cc:j) {
			System.out.println(cc);
		}
		
		
		// program 12
		
		String  city11 = "bhopal";
		//  0  1  2  3  4  5
		//  b  h  o  p  a  l
		
		String k = city11.substring(2);
		System.out.println(k);
		
		String l = city11.substring(2,5);
		System.out.println(l);
		
		
		// program 13
		
		String city12 = "nashik";
		String rev = "";
		
		for(int i1 = 0 ;  i1 < city12.length() ; i1++) {
			rev =  city12.charAt(i1)+rev;
		}
		System.out.println(rev);
		
		String rev2 = "";
		for(int i1 = city12.length() -1 ;  i1 >= 0 ; i1--) {
			rev2 =  rev2 + city12.charAt(i1);
		}
		
		System.out.println(rev2);
		
		
	}

}
