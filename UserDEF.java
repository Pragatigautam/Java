
public class UserDEF {

	public static void main(String[] args) {
		
		//creating object for NIC class
		
		NICK NKathmandu = new NICK ("Nepal", "Kathmandu");
		System.out.println(NKathmandu.City);
		System.out.println(NKathmandu.Country);
		
		NKathmandu.DisplayMessage();
		
		NKathmandu.Loan();
		NKathmandu.Save();
		
		CityBank Boston = new CityBank ("USA", "Boston", 255);
		System.out.println(Boston.Country);
		System.out.println(Boston.City);
		System.out.println(Boston.NumOfBranch);
		Boston.DisplayMessage();
		Boston.Loan();
	
		BOA ABC = new BOA ("USA", "New York");
		System.out.println(ABC.Country);
		System.out.println(ABC.City);
		ABC.Loan();
		ABC.Save();
		
		
		
		
		
	

	}

}

class WorldBankk{
	String Country;
	
	public WorldBankk(String CN) {
		this.Country = CN;
		
	}
	
	public void DisplayMessage() {
		System.out.println("Welcome to our bank");
	}
	
	public void Save() {
		System.out.println("This is save method for worldbank");
	}
	public void Loan() {
		System.out.println("This is loan method for worldBank");
	}
}

class NICK extends WorldBankk{
	String City;
	
	public NICK(String CN, String CT) {
		super (CN);
		this.City = CT;
		
		
	}
	public void Save() {
		System.out.println("This is save method for NIC bank");
	}
	
	public void Loan() {
		System.out.println("This is loan method for NIC bank");
	}
}

class BOA extends WorldBankk{
	String City;
	
	
	public BOA(String CN, String CT) {
		super(CN);
		this.City = CT;
		
	}
	
	public void Save() {
		System.out.println("This is save method for BOAbank");
	}
	
	public void Loan() {
		System.out.println("This is loan method for BOA bank");
	}
	
	
	
}

class CityBank extends BOA{
	
	int NumOfBranch;

	public CityBank(String CN, String CT, int NB) {
		super(CN, CT);
		this.NumOfBranch = NB;
		
	}
	
	public void Save() {
		System.out.println("This is save method for CityBank bank");
	}
	
	public void Loan() {
		System.out.println("This is loan method for CityBank bank");
	}
	
	
	
}


