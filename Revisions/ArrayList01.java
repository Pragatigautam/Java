ipackage Revisions;

import java.util.ArrayList;

public class ArrayList01 {

	public static void main(String[] args) {
		ArrayList<String> Animals = new ArrayList<>();
		Animals.add("Ant");
		Animals.add("Bear");
		Animals.add("Cat");
		Animals.add("Dog");
		Animals.add("Elephant");
		
		System.out.println(Animals);
		
		
		boolean A = Animals.contains("Bear");
		System.out.println(A);
		
		Animals.remove(1);
		System.out.println(Animals);
		
		String B = Animals.get(2);
		System.out.println(B);
		
		Animals.set(0, "Wolf");
		System.out.println(Animals);
		
		for (int i=0; i<Animals.size(); i++) {
			System.out.println(Animals.get(i));
		}
		
		for (String Z: Animals) {
			System.out.println(Z);
		}
		
		
		
	

	}

}
