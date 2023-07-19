package two;

public class TestThurs {

	public static void main(String[] args) {
		
		ParrotT Pink = new ParrotT("Pink", 2);
		System.out.println(Pink.Age);
		System.out.println(Pink.Name);
		
		Pink.Fly();
		Pink.Sing();
		

	}

}

abstract class BirdsT{
	String Name;
	public BirdsT(String NM) {
		this.Name = NM;
	}
	
	abstract void Fly();
	public void Sing() {
		System.out.println("I can sing");
	}

	
}

class ParrotT extends BirdsT{
	int Age;
	public ParrotT(String NM, int AG) {
		super(NM);
		this.Age = AG;
		
	}
	
	public void Fly() {
		System.out.println("I can fly");
	}

	
}
