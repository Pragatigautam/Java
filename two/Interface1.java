package two;
interface GrandFatherS{
	public void Message();
	public void Message2();
	
}

interface GrandMotherM{
	public void GMaa();
	public void GMaaMessage();
	
}

public class Interface1 {

	public static void main(String[] args) {
		FatherP Pradeep = new FatherP();
		Pradeep.Message();
		Pradeep.Message2();
		Pradeep.GMaa();
		Pradeep.GMaaMessage();
		
		SonP Prajwol = new SonP();
		Prajwol.Message();
		Prajwol.Message2();
	}
}
class FatherP implements GrandFatherS , GrandMotherM{

	
	public void Message() {
		System.out.println("I am father");	
	}
	public void Message2() {
		System.out.println("I am dad");	
	}
	public void GMaa() {
		System.out.println("This is first method from GrandMother");
		
	}
	public void GMaaMessage() {
		System.out.println("This is second method for GrandMother");	
	}	
}
class SonP implements GrandFatherS{

	
	public void Message() {
		System.out.println("I am son");
		
	}

	
	public void Message2() {
		System.out.println("I am a kid");
		
	}
	
}
