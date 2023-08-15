import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Iteration {

	public static void main(String[] args) {
		HashMap<String, Integer> hashOne = new HashMap<>();
		System.out.println(hashOne);
		
		hashOne.put("Name1", 100);
		hashOne.put("Name2", 200);
		hashOne.put("Name3", 300);
		hashOne.put("Name4", 400);
		hashOne.put("Name5", 500);
		System.out.println(hashOne);
		
		//update
		hashOne.put("Name4", 40404);
		System.out.println(hashOne);
		
		//retrive
		int a = hashOne.get("Name2");
		System.out.println(a);
		
		//remove
		hashOne.remove("Name5");
		System.out.println(hashOne);
		
		
		//size
		
		System.out.println(hashOne.size());
		
		
		//if key exists
		if(hashOne.containsKey("Name1")) {
			System.out.println(hashOne.get("Name1"));
			
		}
		
		if(hashOne.containsValue(40404)) {
			System.out.println("It is available in key Name4");
			
		}
		
		
		//for each loop for keys and values
		
		for(String Key: hashOne.keySet()) {
			System.out.println(Key);
			System.out.println(hashOne.get(Key));
		}
		
		//to get keys and values 
		System.out.println(hashOne.keySet());
		System.out.println(hashOne.values());
		
		
		for(Map.Entry<String, Integer> entry: hashOne.entrySet()) {
			System.out.println(entry.getKey()+ " "+ entry.getValue());
		}
		
		Iterator<Map.Entry<String, Integer>> Ite = hashOne.entrySet().iterator();
		
		while(Ite.hasNext()) {
			Map.Entry<String, Integer> entry = Ite.next();
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());
		}
		

	}

}
