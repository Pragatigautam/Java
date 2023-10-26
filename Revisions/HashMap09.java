package Revisions;

import java.util.HashMap;
import java.util.Map;

public class HashMap09 {

	public static void main(String[] args) {
		HashMap<String, Integer> Students = new HashMap<>();
		Students.put("Pragati", 14);
		Students.put("Biplov", 13);
		Students.put("Prajwol", 23);
		Students.put("Bipisha", 10);
		
		Students.put("Bipisha", 11);
		System.out.println(Students);
		
		System.out.println(Students.keySet());
		System.out.println(Students.values());
		
		for(Map.Entry<String, Integer> LoopAll: Students.entrySet()) {
			System.out.println(LoopAll.getKey()+ " "+ LoopAll.getValue());
		}

	}

}
