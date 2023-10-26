package two;

import java.util.ArrayList;

public class ArrayList02 {

	public static void main(String[] args) {
		ArrayList<String> ProgLng = new ArrayList<>();
		
		//create
		ProgLng.add("Java");
		ProgLng.add("Python");
		ProgLng.add("Flutter");
		ProgLng.add("Javascript");
		System.out.println(ProgLng);
		
		//retrive
		String A = ProgLng.get(2);
		System.out.println(A);
		
		//update
		ProgLng.set(1, "Selenium");
		System.out.println(ProgLng);
		
		//delete
		ProgLng.remove(2);
		System.out.println(ProgLng);
		
		for (int i=0; i<ProgLng.size(); i++) {
			System.out.println(ProgLng.get(i));
		}
		
		int i1 = 0;
		while (i1<ProgLng.size()) {
			System.out.println(ProgLng.get(i1));
			i1++;
		}
		
		for (String ProgLng2:ProgLng) {
			System.out.println(ProgLng2);
		}
			
			
		
		

	}

}
