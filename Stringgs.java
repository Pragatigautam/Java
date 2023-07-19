
public class Stringgs {

	public static void main(String[] args) {
		
		// program 1 defining a string and printing it by string name
		String name = ("pragati");{
				System.out.println(name);
		}
		
		//program 2 printing the character from it's index
		char secondChar = name.charAt(1);{
			System.out.println(secondChar);
		}
		
		//length-1 is always the last index
		
		// program 3 total number of character
		
		String lastName=("gautam");{
			int totalChar = lastName.length();
			System.out.println(totalChar);
		}
		
		// program 4  print the number of length and every character separatly
		String fatherName = "pradeep";
		int totalP = fatherName.length();
		System.out.println(totalP);
		for (int i=0; i<totalP; i++) {
			System.out.println(fatherName.charAt(i));
		}
		
		// program 5 print each character of pune separatly
		String city = "pune";
		for (int i=0; i<city.length(); i++) {
			System.out.println(city.charAt(i));
		}
		
		//program 6 print every character in reverse of pune
		for (int i=city.length()-1; i>=0; i--){
			System.out.println(city.charAt(i));
			
			
		}
		
		//program 7 uppercase
		String city2="Irving";
		String upperCaseString = city2.toUpperCase();
		System.out.println(upperCaseString);
		
		// Program 8 lowercase
		String city3 = "DallAs";
		String lowerCaseString = city3.toLowerCase();
		System.out.println(lowerCaseString);
		
		
		//each character of islington
		
		 String college = "islington";
		  for (int i=0; i<college.length(); i++) {
			  System.out.println(college.charAt(i));
		  }
		  
		
		

		//reverse no space
		  String city4 = "Pune";
		  String reverseCity= "";
		  
		  for( int i  = 0; i < city4.length(); i ++)
		  
		  {   
		   reverseCity = city.charAt(i) + reverseCity; 
		   
		  }   
		  System.out.println(reverseCity);
		
//		
//		  String city4 = "Pune";             
//		  String reverseCity= "";
////		  
////		 
////		  
//		  for( int i  = city4.length()-1; i >=0;  i--)
//		  
//		  {   
//			  reverseCity = reverseCity + city4.charAt(i);
//		   
//		  }   
//		  System.out.println(reverseCity);
//		  
		  
		  
		 
		
		
		
		
		
		
		
	
		  
		  

		
		
		
		
		
		
		

		
		
		

     
		
	
		
		

	}

}
