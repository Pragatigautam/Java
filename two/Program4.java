package two;

public class Program4 {

	public static void main(String[] args) {
		
		WorldBank2 ABCD = new WorldBank2 ("Nepal");
		System.out.println(ABCD.Country);
		
		ABCD.DisplayMessage();
		ABCD.Loan();
		ABCD.Save();
		
		
		
		
		NICBank Kathmandu = new NICBank("Nepal", "Kathmandu");
		System.out.println(Kathmandu.Country);
		System.out.println(Kathmandu.City);
		
		Kathmandu.DisplayMessage();
		Kathmandu.Loan();
		Kathmandu.Save();
		

	}

}

class WorldBank2{
	String Country;
	
	public WorldBank2(String CN) {
		this.Country = CN;
	}
	
	public void DisplayMessage() {
		System.out.println("Welcome to our bank");
	}
	
	public void Loan() {
		System.out.println("This is loan method for WorldBank");
	}
	
	public void Save() {
		System.out.println("This is Save method for WorldBank");
	}
}



class NICBank extends WorldBank2{
	String City;
	
	public NICBank(String CN, String CT) {
		super(CN);
		this.City = CT;
		
	}
	
	public void Loan() {
		System.out.println("This is loan method for NICBank");
	}
	
	public void Save() {
		System.out.println("This is Save method for NICBank");
	}
	
	
}


