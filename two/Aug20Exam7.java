package two;

public class Aug20Exam7 {

	public static void main(String[] args) {
		NICB N1 = new NICB("Nepal", "Kathmandu");
		N1.displayMessage();
		

	}

}
abstract class WorldB{
	String Country;
	
	public WorldB(String CN) {
		this.Country = CN;
	}
	abstract void displayMessage();
	
}

class NICB extends WorldB{
	String City;
	
	public NICB(String CN, String CT) {
		super(CN);
		this.City = CT;
	}
	
	public void displayMessage() {
		System.out.println("Welcome to NIC Bank. This method is over ridden from above abstract method");
	}
}
