
public class InheritPractice {

	public static void main(String[] args) {
		
		Son Prajwol =new Son ("Prajwol", "Gautam", 27);
		System.out.println(Prajwol.FirstName);
		System.out.println(Prajwol.LastName);
		System.out.println(Prajwol.age);
		
		Prajwol.DisplayName();
		
		
		//creating object for child class
		Father PrajwolF = new Father("Prajwol", "Gautam", 27, 5);
		System.out.println(PrajwolF.age);
		System.out.println(PrajwolF.FirstName);
		System.out.println(Prajwol.LastName);
		
		PrajwolF.displayKids();
		

	}

}

//creating class for parent class

class Son{
	String FirstName;
	String LastName;
	int age;
	
	public Son(String FN, String LN, int AG) {
		this.FirstName = FN;
		this.LastName = LN;
		this.age= AG;
		
		
	}
	public void DisplayName() {
		System.out.println(this.FirstName+this.LastName);
	}
}


//creating class for child class
	class Father extends Son {
		int kids;
	public Father(String FN, String LN, int AG, int NK) {
		super(FN,LN,AG);
		this.kids = NK;
	}
	public void displayKids() {
		System.out.println(this.kids);
	}
	
}

	
	
	
	