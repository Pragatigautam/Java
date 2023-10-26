package Revisions;

import java.util.ArrayList;

public class ArrayListClass01 {

	public static void main(String[] args) {
		Family01 Father = new Family01(12, "Gautam");
		Family01 Mother = new Family01(13, "Khadka");
		Family01 Sister = new Family01(9, "Adhikari");
		Family01 Brother = new Family01(10, "Pandey");
		
		ArrayList<Family01> abc = new ArrayList<>();
		abc.add(Father);
		abc.add(Mother);
		abc.add(Sister);
		abc.add(Brother);
		
		abc.get(0).getFamilyName();
		
		for(int i=0; i<abc.size(); i++) {
			System.out.println(abc.get(i).members);
			System.out.println(abc.get(i).FamilyName);
			abc.get(i).getFamilyName();
			
		}
		
		
		
		

	}

}
class Family01{
	int members;
	String FamilyName;
	
	public Family01(int M, String FN) {
		this.members= M;
		this.FamilyName=FN;
	}
	
	public void getFamilyName() {
		System.out.println(this.FamilyName);
	}
}
