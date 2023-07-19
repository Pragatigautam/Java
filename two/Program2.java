package two;

public class Program2 {

	public static void main(String[] args) {
		
		Student123 Pragati = new Student123("Pragati", "Gautam");
		System.out.println(Pragati.FirstName);
		System.out.println(Pragati.LastName);
		
		Pragati.DisplayName();
		
	}

}

class Student123{
	String FirstName;
	String LastName;
	
	public Student123(String FN, String LN) {
		this.FirstName = FN;
		this.LastName = LN;
		
		
		
	}
	
	public void DisplayName () {
		System.out.println(this.FirstName + this.LastName);
	}
}
