package two;
//command shift O to import
import java.util.HashMap;

public class HashMapDay1 {

	public static void main(String[] args) {
		HashMap<String ,Integer> students = new HashMap<>();
		students.put("chinmay", 33);
		students.put("rabindra", 45);
		students.put("anisha", 25);
		students.put("laxmi", 25);
		students.put("payal", 27);
		System.out.println(students);
		
		
		//chinmay is key and 33 is value
		// Accessing the value from HashMap()
		int a = students.get("chinmay");
		System.out.println(a);
		
		// check particular key exists 
		boolean b = students.containsKey("Laxmi");
		System.out.println(b);
		
		
		// total number of key value in HashMap()
		int c = students.size();
		System.out.println(c);
		
		
		// remove the value 
		students.remove("chinmay");
		System.out.println(students);
		
		
		// update the value
		students.put("laxmi", 27);
		System.out.println(students);
		
		
		// looping through HashMap
		
//		System.out.println(students.values());
//		System.out.println(students.keySet());
//		
//		for (int i=0; i<=students.size(); i++) {
//			String Buffer=students.get(i);
//			System.out.println("Hello "+ students.get(i));
//			
//	
//		}
		
		// loop over it using above method 
		// print all keys and their values 

	}

}
