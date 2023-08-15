package Revisions;

import java.util.HashMap;
import java.util.Map;

public class day35 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<String, String> course = new HashMap<String, String>();
//		course.put("course", "javascript");
//		course.put("courseTwo", "html");
//		course.put("courseThree", "css");
//		course.put("courseFour", "python");
//		course.put("courseFive", "selenium");
//		System.out.println(course);
//		
//
//		for (Map.Entry<String, String> entry : course.entrySet()) {
//			System.out.println(entry.getKey() + entry.getValue());
//			
	//	}
//		
//		
//		// program 2
//		
//		Map<String, String> students = new HashMap<String, String>();
//		students.put("firstName", "chinmay");
//		students.put("lastName", "deshpande");
//		students.put("rollNo", "12");
//		students.put("age", "33");
//		students.put("skills", "Talking");
//		
//		for(String Key:students.keySet()) {
//			System.out.println(Key);
//		}
//		
//		for(String value:students.values()) {
//			System.out.println(value);
//		}
		
		
		Map<String, String> vehicle = new HashMap<String, String>();
		vehicle.put("color","red");
		vehicle.put("type","SUV");
		vehicle.put("company","tata");
		//System.out.println(vehicle);
		
		System.out.println(vehicle.get("color"));
		for(String key :vehicle.keySet()) {
			//System.out.println(key);
			System.out.println(vehicle.get(key));
		}
		
		
		//using Iterator 
		
		
		
		// forEach()
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	

}