package two;

import java.util.HashMap;

public class day33 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<String ,Integer> students = new HashMap<>();
		
		students.put("chinmay", 33);
		students.put("rabindra", 45);
		students.put("anisha", 25);
		students.put("laxmi", 25);
		students.put("payal", 27);
		System.out.println(students);
		
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
		
		System.out.println(students.values());
		System.out.println(students.keySet());
		
		// loop over it using above method 
		// print all keys and their values 
		
	
		
		
		
	}
	
	
	

}