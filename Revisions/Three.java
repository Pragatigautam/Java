package Revisions;

public class Three {

	public static void main(String[] args) {
		
		Tchr pragati = new Tchr(100000, "Pragati","Gautam");
		System.out.println(pragati.salary);
		System.out.println(pragati.firstName);
		System.out.println(pragati.lastName);
		
		pragati.displaySalary();
		
		System.out.println(pragati.displayName());
		
		
		
		
		
		
		Std prg = new Std(100000, "Pragati","Gautam", 1, "William drv");
		System.out.println(prg.salary);
		System.out.println(prg.firstName);
		System.out.println(prg.lastName);
		System.out.println(prg.rollNum);
		System.out.println(prg.Address);
		
		
		prg.displaySalary();	
		System.out.println(prg.displayName());
		prg.displayRL();
	
			
		
	}

}
class Tchr{
	int salary;
	String firstName;
	String lastName;
	
	public Tchr(int sl, String fn, String ln) {
		this.salary = sl;
		this.firstName = fn;
		this.lastName = ln;
	}
	
	public void displaySalary() {
		System.out.println(this.salary);
	}
	
	public String displayName() {
		return this.firstName + " " + this.lastName;
	}
}


class Std extends Tchr{
	
	int rollNum;
	String Address;

	public Std(int sl, String fn, String ln, int rl, String Ad) {
		super(sl, fn, ln);
		this.rollNum = rl;
		this.Address = Ad;
		
	}
	public void displaySalary() {
		System.out.println("I dont get salary because i am a student." );
	}
	public void displayRL() {
		System.out.println(this.rollNum);
	}
	
}
