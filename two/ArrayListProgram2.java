package two;
import java.util.ArrayList;
public class ArrayListProgram2 {

	public static void main(String[] args) {
		
		GFamily Father = new GFamily(6,"Gautam");
		GFamily Mother = new GFamily(7,"Gautam1");
		GFamily Son = new GFamily(8,"Gautam2");
		GFamily Daughter = new GFamily(9,"Gautam3");
		
		ArrayList<GFamily> AllMembers= new ArrayList<>();
		AllMembers.add(Father);
		AllMembers.add(Mother);
		AllMembers.add(Son);
		AllMembers.add(Daughter);
		
		AllMembers.get(0).DisplayFamilyName();
		
		//for loop
		for (int i=0; i<AllMembers.size(); i++) {
			System.out.println(AllMembers.get(i).members);
			System.out.println(AllMembers.get(i).FamilyName);
			AllMembers.get(i).DisplayFamilyName();
		}
		
		//while loop
		int i1=0;
		while (i1<AllMembers.size()) {
			System.out.println(AllMembers.get(i1).members);
			System.out.println(AllMembers.get(i1).FamilyName);
			AllMembers.get(i1).DisplayFamilyName();
			i1++;
		}
		
		//for each loop
		for(GFamily A:AllMembers) {
			System.out.println(A.members);
			System.out.println(A.FamilyName);
			A.DisplayFamilyName();
		}
		
		

	}

}
class GFamily{
	int members;
	String FamilyName;
	
	public GFamily(int M, String FN) {
		this.members = M;
		this.FamilyName = FN;
				
	}
	public void DisplayFamilyName() {
		System.out.println(this.FamilyName);
	}
}
