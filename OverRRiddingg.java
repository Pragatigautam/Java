
public class OverRRiddingg {

	public static void main(String[] args) {
		
		//creating object for SBI class
		
		SBI Pune = new SBI("India", "Pune");
		Pune.Loan();
		Pune.Save();
		Pune.DisplayMessage();
		
		
		
		
		
		
		//creating object for PNB class
		
		PNB Panjab = new PNB("India", "Panjab");
		Panjab.Save();
		Panjab.DisplayMessage();
		Panjab.Loan();
		
		
		//creating object for WorldBank class
		
		
		WorldBank India = new WorldBank("India");
		System.out.println(India.Country);
		
		India.DisplayMessage();
		India.Loan();
		India.Save();
		
		
		

	}

}

class WorldBank{
	String Country;
	
	public WorldBank(String CN) {
		this.Country = CN;
	}
	
	public void Save() {
		System.out.println("This is save method for worldbank");
		
	}
	
	public void Loan() {
		System.out.println("This is loan method for worldbank");
		
	}
	
	public void DisplayMessage() {
		System.out.println("Welcome to our bank");
		
	}
}


class SBI extends WorldBank{
	String City;
	
	public SBI(String CN , String CT) {
		super(CN);
		this.City = CT;
	}
	
	public void Save() {
		System.out.println("This is save method for SBI");
		
	}
	
	public void Loan() {
		System.out.println("This is loan method for SBI");
		
	}
}

class PNB extends WorldBank{
	String City;
	
	public PNB(String CN , String CT) {
		super(CN);
		this.City = CT;
	}
	
	public void Save() {
		System.out.println("This is save method for PNB");
		
	}
	
	public void Loan() {
		System.out.println("This is loan method for PNB");
		
	}
}

