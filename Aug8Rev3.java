import java.util.ArrayList;

public class Aug8Rev3 {

	public static void main(String[] args) {
		ArrayList<String> Family = new ArrayList<>();
		Family.add("Father");
		Family.add("Mother");
		Family.add("Sister");
		Family.add("Brother");
		boolean A = Family.add("Husband");
		System.out.println(A);
		
		
		Family.add(2, "Biplov");
		System.out.println(Family);
		
		Family.add(3, "Mamu");
		System.out.println(Family);
		
		
		Family.remove(6);
		System.out.println(Family);
		
		Family.remove("Sister");
		System.out.println(Family);
		
		Family.clear();
		System.out.println(Family);
		
		Family.add("Mamu");
		Family.add("Baba");
		Family.add("Dada");
		Family.add("Biplov");
		System.out.println(Family);
		
		
		//to add one more element in any index
		
		Family.add(2, "Bhauju");
		Family.add(4, "Pragati");
		System.out.println(Family);
		
		boolean B = Family.contains("Pragati");
		System.out.println(B);
		
		boolean C = Family.contains("biplov");
		System.out.println(C);
		
		
		String D = Family.get(3);
		System.out.println(D);
		
		int E = Family.indexOf("Mamu");
		System.out.println(E);
		
		
		ArrayList<String> Animals = new ArrayList<>();
		Animals.add("Ant");
		Animals.add("Bear");
		Animals.add("Cat");
		Animals.add("Dog");
		Animals.add("Bear");
		
		
		String WantedAnimal = "Elephant";
		if (Animals.contains(WantedAnimal)) {
			System.out.println("Yes it is on the Animals ArrayList.");
		}
		else {
			System.out.println("It is not on the Animals ArrayList.");
		}
		
		int S=Animals.size();
		System.out.println(S);
		
		System.out.println(Animals);
		
		System.out.println(Animals.indexOf("Ant"));
		System.out.println(Animals.indexOf("Bear"));
		System.out.println(Animals.lastIndexOf("Bear"));
		
		

	}

}
