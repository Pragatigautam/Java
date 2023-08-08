package two;
interface FirstBank{
	public void Loan();
	public void Save();
	
}

interface NextFirstBank{
	public void DisplayMessage();
}

class NewClass{
	public void CMethod() {
		System.out.println("Method from class");
	}
}

public class July23Program3 {

	public static void main(String[] args) {
		SecondBank S = new SecondBank();
		S.Loan();
		S.Save();
		S.DisplayMessage();
		S.CMethod();
		

	}

}
class SecondBank extends NewClass implements FirstBank, NextFirstBank{
	public void Loan() {
		System.out.println("Loan method inherited");
		
	}
	
	public void Save() {
		System.out.println("Save method inherited");
	}
	public void DisplayMessage() {
		System.out.println("Hello");
	}
	
}
