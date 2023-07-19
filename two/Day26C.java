package two;
interface WBA{
	public void Save();
	public void Loan();
	
}

interface WBI{
	public void DisplayCountry();
	public void DisplayCity();
	
}
public class Day26C {

	public static void main(String[] args) {
		
		BankA Ktm = new BankA();
		Ktm.DisplayCity();
		Ktm.DisplayCountry();
		Ktm.Loan();
		Ktm.Save();
		

	}

}
//more than one interface can be implemented by class


class BankA implements WBA, WBI{

	
	public void DisplayCountry() {
		System.out.println("this is Nepal");
		
		
	}

	
	public void DisplayCity() {
		System.out.println("Kathmandu");
		
		
	}

	
	public void Save() {
		System.out.println("Save method");
		
	}

	
	public void Loan() {
		System.out.println("loan method");
		
	}
	
	
	
	
	
}
