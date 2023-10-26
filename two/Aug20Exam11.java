package two;

import java.util.HashMap;
import java.util.Map;

public class Aug20Exam11 {

	public static void main(String[] args) {
		HashMap<String, String> Students = new HashMap<>();
		Students.put("Pragati", "Java");
		Students.put("Prajwol", "Django");
		Students.put("Biplov", "Javascript");
		Students.put("Bipisha", "Selenium");
		
		for(Map.Entry<String, String> LoopAll: Students.entrySet()) {
			System.out.println(LoopAll.getKey() + " "+ LoopAll.getValue());
		}

	}

}
