package Revisions;

import java.util.ArrayList;

public class ArrayList09 {

	public static void main(String[] args) {
		ArrayList<String> Students = new ArrayList<>();
		Students.add("pragati");
		Students.add("Biplov");
		Students.add("Prajwol");
		Students.add("Bipisha");
		
		
		Students.set(1, "Hi");
		System.out.println(Students);
		
		Students.remove(0);
		System.out.println(Students);
		
		//to loop
		
		for(int i=0; i<Students.size(); i++) {
			System.out.println(Students.get(i));
		}
		
		//for each
		
		for(String A:Students) {
			System.out.println(A);
		}

	}

}
