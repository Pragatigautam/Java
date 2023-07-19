
public class naya {

	public static void main(String[] args) {
		
		NIC kathmandu = new NIC("Nepal", "Kathmandu");
		System.out.println(kathmandu.city);
		kathmandu.DisplayMessage();
		
		NepalRastraBank Nepal = new NepalRastraBank("Nepa");
		System.out.println(Nepal.Country);
		
		
		

		
		

	}

}

class NepalRastraBank{
	String Country;
	
	public NepalRastraBank(String CN) {
		this.Country = CN;
	}
	
	public void loan() {
		System.out.println("loan from NepalRastraBank");
	}
	
	public void save() {
		System.out.println("save from NepalRastraBank");
	}
	
	public void DisplayMessage() {
		System.out.println("welcome to our bank");
	}
	
}

class NIC extends NepalRastraBank {
	
	String city;
	
	public NIC(String CN, String CT) {
		super (CN);
		this.city = CT;
	}
}





