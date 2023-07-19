
public class OneParentOneChild {

	public static void main(String[] args) {
		FatherA Prajwol = new FatherA();
		
		
		Prajwol.Age = 28;
		Prajwol.FirstName = "Prajwol";
		Prajwol.LastName = "Gautam";
		
		System.out.println(Prajwol.Age);
		System.out.println(Prajwol.FirstName);
		System.out.println(Prajwol.LastName);
		
		Prajwol.DisplayName();
		
		
		SonA PrajwolB = new SonA();
		PrajwolB.SonFName = "PrajwolM";
		
		PrajwolB.FirstName = "Prajwol";
		PrajwolB.LastName = "Gautam";
		
		
		System.out.println(PrajwolB.SonFName);
		System.out.println(Prajwol.Age);
		System.out.println(Prajwol.LastName);
		
		PrajwolB.DisplayName();
				
		

	}

}

class FatherA{
	String FirstName;
	String LastName;
	int Age;
	
	public void DisplayName() {
		System.out.println(this.FirstName + this.LastName);
	}
}

class SonA extends FatherA{
	String SonFName;
	
	public void DisplayName() {
		System.out.println(this.SonFName + this.LastName);
	}
}
