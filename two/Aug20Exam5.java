package two;

public class Aug20Exam5 {

	public static void main(String[] args) {
		WorldBank09 W1 = new WorldBank09("Nepal");
		System.out.println(W1.Country);
		W1.displayMessage();
		
		
		NICBANK09 N1 = new NICBANK09("Nepal", "Kathmandu");
		System.out.println(N1.Country); 
		System.out.println(N1.City); 
		N1.displayMessage();
		
		

	}

}
class WorldBank09{
	String Country;
	
	public WorldBank09(String CN) {
		this.Country = CN;
	}
	public void displayMessage() {
		System.out.println("Welcome to worldBank.");
		
	}
}
class NICBANK09 extends WorldBank09{
	String City;
	
	public NICBANK09(String CN, String CT) {
		super(CN);
		this.City = CT;
	}
	//overring parent class method here
	public void displayMessage() {
		System.out.println("Welcome to NIC Bank.");
	}
}
