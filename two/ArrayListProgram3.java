package two;

import java.util.ArrayList;

public class ArrayListProgram3 {

	public static void main(String[] args) {
		//define
		ArrayList<String> language = new ArrayList<>();
		
		//create
		language.add("Java");
		language.add("JavaScript");
		language.add("C#");
		language.add("Selenium");
		
		//retrieve
		String Lan1= language.get(0);
		String Lan2= language.get(0);
		String Lan3= language.get(0);
		String Lan4= language.get(0);
		
		for (int i=0; i<language.size(); i++) {
		System.out.println(language.get(i));
		}
		
		//update
		
		ArrayList<String> Birds = new ArrayList<>();
		Birds.add("Parrot");
		Birds.add("Hawk");
		Birds.add("Eagle");
		Birds.add("owl");
		
		System.out.println(Birds);
		
		Birds.set(1, "Sparrow");
		System.out.println(Birds);
		
		Birds.remove(2);
		System.out.println(Birds);
		
		
		
		
		

	}

}
