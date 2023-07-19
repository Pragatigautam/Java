
public class InheritenceWithConstructor {

	public static void main(String[] args) {
		
		//creating object for parent class i.e. student
		
		studentA NPragati = new studentA ("Pragati", "Gautam", 668);
		System.out.println(NPragati.FirstName);
		System.out.println(NPragati.LastName);
		System.out.println(NPragati.ssn);
		
		NPragati.FullName();
		
		
		//creating object for child class i.e. teacher
		
		teacherA TPragati = new teacherA ("Pragati", "Gautam", 668 , 5000);
		System.out.println(TPragati.FirstName);
		System.out.println(TPragati.LastName);
		System.out.println(TPragati.salary);
		System.out.println(TPragati.ssn);
		
		TPragati.FullName();
		TPragati.displaySalary();
		
		
		

	}

}

//creating class with constructor for parent class

class studentA {
	String FirstName;
	String LastName;
	int ssn;
	
	public studentA(String FN, String LN, int sn) {
		this.FirstName = FN;
		this.LastName = LN;
		this.ssn = sn;
	}
	
	public void FullName() {
		System.out.println(this.FirstName + this.LastName);
	}
}

//creating the child class i.e. teacher

class teacherA extends studentA{
	int salary;
	
	public teacherA (String FN, String LN, int sn, int sl) {
		super(FN,LN,sn);
		this.salary=sl;
		
	}
	
	public void displaySalary() {
		System.out.println(this.salary);
	}
}
