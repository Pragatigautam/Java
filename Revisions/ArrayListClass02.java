package Revisions;

import java.util.ArrayList;

public class ArrayListClass02 {

	public static void main(String[] args) {
		Families Mother = new Families(8, "Khadka");
		Families Father = new Families(7, "Gautam");
		Families Sister = new Families(9, "Adhikari");
		Families Brother = new Families(10, "Pandey");
		
		
		
		ArrayList<Families> Fam = new ArrayList<>();
		Fam.add(Mother);
		Fam.add(Father);
		Fam.add(Sister);
		Fam.add(Brother);
		Fam.get(0).getFamilyName();
		
		
		for(int i=0; i<Fam.size(); i++) {
			System.out.println(Fam.get(i).members);
			System.out.println(Fam.get(i).FamilyName);
			Fam.get(i).getFamilyName();
		}
		

	}

}
class Families{
	int members;
	String FamilyName;
	
	public Families(int MB, String FN) {
		this.members = MB;
		this.FamilyName = FN;
		
	}
	
	public void getFamilyName() {
		System.out.println(this.FamilyName);
	}
	
}
