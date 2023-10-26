package Revisions;

import java.util.HashMap;
import java.util.Map;

public class MapHahmap {

	public static void main(String[] args) {
		Map<String, String> Students = new HashMap<>();
		Students.put("Course1", "Java");
		Students.put("Course2", "Python");
		Students.put("Course3", "JavaScript");
		Students.put("Course4", "Flutter");
		
		
		
		
		System.out.println(Students.keySet());
		System.out.println(Students.values());
		
		for(Map.Entry<String, String> Loop1: Students.entrySet()) {
			System.out.println(Students.keySet()+" "+Students.values());
		}
		

	}

}
