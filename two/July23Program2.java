package two;

public class July23Program2 {

	public static void main(String[] args) {
		KtmBank KB = new KtmBank();
		KB.DisplayMessage();
		KB.Loan();
		KB.Save();
		

	}

}
abstract class MainnBank{
	abstract void DisplayMessage();
	public void Loan() {
		System.out.println("This i loan method for MainnBank");
	}
	public void Save() {
		System.out.println("This i Save method for MainnBank");
	}
	
	
	
	
}

class KtmBank extends MainnBank{

	
	public void DisplayMessage() {
		System.out.println("Hello");
		
		
	}
	
}
