package two;

public class RevisionForExamPT1 {

	public static void main(String[] args) {
		//creating object for main class
//		MainBank A = new MainBank("Nepal",35);
//		System.out.println(A.Country);
//		System.out.println(A.Years);
//		A.Loan();
//		A.DisplayMsg();
//		A.Save();
		
		//creating object for child class
		NepalBank N = new NepalBank("Nepal", 35, "Kathmandu");
		System.out.println(N.Country);
		System.out.println(N.City);
		System.out.println(N.Years);
		N.DisplayMsg();
		N.Loan();
		N.Save();
		N.AMethod();
		
		//creating object for PokharaBank
		PokharaBank P = new PokharaBank("Nepal", 32, "Kathmandu" ,"Pokhara");
		System.out.println(P.Country);
		System.out.println(P.City);
		System.out.println(P.Years);
		System.out.println(P.CityTwo);
		P.Loan();
		P.Save();
		P.DisplayMsg();
		P.AMethod();
		
		

	}

}
 abstract class MainBank{
	String Country;
	int Years;
	
	public MainBank(String CN, int YR) {
		this.Country = CN;
		this.Years = YR;
	}
	public void DisplayMsg() {
		System.out.println("Welcome to our bank");
		
	}
	public void Loan() {
		System.out.println("This is loan method for MainBank");
		
	}
	public void Save() {
		System.out.println("This is save method for MainBank");
	}
	abstract void AMethod();
		
	
	
}

class NepalBank extends MainBank{
	String City;

	public NepalBank(String CN, int YR, String CT) {
		super(CN, YR);
		this.City = CT;
		
	}
	//Overriding
	public void Loan() {
		System.out.println("This is loan method for NepalBank");
		
	}
	//overriding
	public void Save() {
		System.out.println("This is Save method for NepalBank");
		
	}
	public void AMethod() {
		System.out.println("Just for the rule");
	}
	
	
	
}
class PokharaBank extends NepalBank{
	String CityTwo;
	
	
	public PokharaBank(String CN, int YR, String CT, String CTW) {
		super(CN, YR, CT);
		this.CityTwo = CTW;
		
	}
	
	public void Loan() {
		System.out.println("This is loan method for PokharaBank");
	}
	public void Save() {
		System.out.println("This is save method for PokharaBank");
	}

	
	
}
