package Revisions;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class HashMap02 {

	public static void main(String[] args) {
		Map<String, String> Course = new HashMap<String, String>();
		Course.put("CourseOne", "Java");
		Course.put("CourseTwo", "Python");
		Course.put("CourseThree", "Django");
		Course.put("CourseFour", "Flutter");
		Course.put("CourseFive", "JavaScript");
		
		for(Map.Entry<String, String> LoopAll: Course.entrySet()) {
			System.out.println(LoopAll.getKey()+" "+LoopAll.getValue());
		}
		
		System.out.println(Course.keySet());
		System.out.println(Course.values());

	}

}






