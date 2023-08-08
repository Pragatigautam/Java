package two;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapDay2 {

	public static void main(String[] args) {
		Map<String, String> Course = new HashMap<String, String>();
		Course.put("CourseOne", "Java");
		Course.put("CourseTwo", "JavaScript");
		Course.put("CourseThree", "Python");
		Course.put("CourseFour", "C#");
		Course.put("CourseFive", "Html");
		
		for(Map.Entry<String, String> abc : Course.entrySet()) {
		System.out.println(abc.getKey()+ abc.getValue());
		}
		
		// another program
		Map<String, String> Students = new HashMap<String, String>();
		Students.put("FirstName", "Pragati");
		Students.put("LastName", "Gautam");
		Students.put("Age", "23");
		Students.put("SSN", "12345");
		Students.put("Skills", "Java");
		
		//looping through keys
		for (String PropVeriable : Students.keySet()) {
		System.out.println(PropVeriable);
		}
		
	    //looping through values
		for (String PropVeriable : Students.values()) {
			System.out.println(PropVeriable);
		}
		
		//another program
		Map<String, String> Vehicle = new HashMap<String, String>();
		Vehicle.put("Company", "Honda");
		Vehicle.put("Model", "CRV");
		Vehicle.put("Color", "White");
		Vehicle.put("Brand", "2024");
		Vehicle.put("Type", "Sports, SUV");
		System.out.println(Vehicle);
		
		System.out.println(Vehicle.get("Color"));
		for (String a : Vehicle.keySet()) {
			System.out.println(a);
			System.out.println(Vehicle.get(a));
		}
		
		//Iterator
		 // Using iterator to loop through the Vehicle HashMap
        Iterator<Map.Entry<String, String>> iterator = Vehicle.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, String> entry = iterator.next();
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key + ": " + value);
        }
		
		
		
		

		

	}

}
