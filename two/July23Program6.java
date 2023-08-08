package two;

public class July23Program6 {

	public static void main(String[] args) {
		Animalss An = new Animalss("Any");
		System.out.println(An.Type);
		An.Color();
		
		
		Cat Ct = new Cat("Cat", 5);
		System.out.println(Ct.NumberOfCats);
		System.out.println(Ct.Type);
		Ct.Color();
			
		
		

	}

}
class Animalss{
	String Type;
	
	public Animalss(String TP) {
		this.Type = TP;
	}
	public void Color() {
		System.out.println("Insert animal color here");
	}
	
	
}

class Cat extends Animalss{
	int NumberOfCats;

	public Cat(String TP, int Num) {
		super(TP);
		this.NumberOfCats = Num;
		
	}
	//Overriding
	public void Color() {
		System.out.println("The color of cat is white");
		
	}
	
	
	
}
