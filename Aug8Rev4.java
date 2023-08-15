import java.util.HashMap;

public class Aug8Rev4 {

	public static void main(String[] args) {
		HashMap<String, Integer> Employees = new HashMap<>();
		
		Employees.put("Pragati Gautam", 237829);
		Employees.put("Prajwol Gautam", 98723);
		Employees.put("Biplov Adhikari", 86232);
		Employees.put("Bipisha Adhikari", 98273);
		System.out.println(Employees);
		
		
		//Accessing the value from hashmap
		int a = Employees.get("Pragati Gautam");
		System.out.println(a);
		
		int b = Employees.get("Prajwol Gautam");
		System.out.println(b);
		
		int c = Employees.get("Biplov Adhikari");
		System.out.println(c);
		
		int d = Employees.get("Bipisha Adhikari");
		System.out.println(d);
		
		//check if particular key exists
		
		boolean e = Employees.containsKey("Pragati Gautam");
		System.out.println(e);
		
		
		
		
		
		
		//total number of key value
		System.out.println(Employees.size());
		
		//remove the value
		Employees.remove("Bipisha Adhikari");
		System.out.println(Employees);
		
		//update the value
		Employees.put("Pragati Gautam", 900000);
		System.out.println(Employees);
		
		//looping through keys and values
		System.out.println(Employees.keySet());
		System.out.println(Employees.values());

	}

}
