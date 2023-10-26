package two;

import java.util.HashMap;
import java.util.Map;

public class HashMap01 {

	public static void main(String[] args) {
		HashMap<String, Integer> Students = new HashMap<>();
		Students.put("Pragati Gautam", 100);
		Students.put("Biplov Adhikari", 200);
		Students.put("Prajwol Gautam", 300);
		Students.put("Bipisha Adhikari", 400);
		
		int a = Students.get("Pragati Gautam");
		System.out.println(a);
		
		
		int b = Students.get("Bipisha Adhikari");
		System.out.println(b);
		
		boolean c = Students.containsKey("Prajwol Gautam");
		System.out.println(c);
		
		
		int d = Students.size();
		System.out.println(d);
		
		
		Students.remove("Bipisha Adhikari");
		System.out.println(Students);
		
		
		Students.put("Pragati Gautam", 500);
		System.out.println(Students);
		
		
		//to loop keys and values separatly.
		System.out.println(Students.keySet());
		System.out.println(Students.values());
		
		//to loop keys and values together.
		for(Map.Entry<String, Integer> LoopAll: Students.entrySet()) {
			System.out.println(LoopAll.getKey()+" "+ LoopAll.getValue());
			
		}
		
		
		
  
		
		

	}

}
