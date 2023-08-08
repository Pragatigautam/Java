package two;

import java.util.ArrayList;

public class Aug7Test {

	public static void main(String[] args) {
		Vehcle Toyota = new Vehcle(24000, "Camry");
		Vehcle Honda = new Vehcle(35000, "CRV");
		Vehcle VW = new Vehcle (45000, "Polo");
		
		ArrayList<Vehcle> AllVehcle = new ArrayList<>();
		AllVehcle.add(VW);
		AllVehcle.add(Toyota);
		AllVehcle.add(Honda);
		
		AllVehcle.get(0).displayPrice();
		
		
		
		//Loop using for each
		
		
				for(Vehcle A:AllVehcle) {
					System.out.println(A.price);
					System.out.println(A.Name);
					A.displayPrice();
				}
		
		

	}

}
class Vehcle{
	int price;
	String Name;
	
	public Vehcle(int P, String N) {
		this.price = P;
		this.Name = N;
	}
	
	public void displayPrice() {
		System.out.println(this.price);
	}
}

