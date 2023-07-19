
public class InheritanceNoConstructor {

	public static void main(String[] args) {
		
		//creating object for parent class i.e. student
		student pragati = new student();
		System.out.println(pragati.FirstName);
		System.out.println(pragati.LastName);
		System.out.println(pragati.ssn);
		pragati.FullName();
		
		
		//creating object for child class i.e. teacher
		
		teacher NPragati = new teacher();
		System.out.println(NPragati.FirstName);
		System.out.println(NPragati.LastName);
		System.out.println(NPragati.salary);
		System.out.println(NPragati.ssn);
		
		NPragati.FullName();
		NPragati.DisplaySalary();
		

	}

}

//creating parent class
class student {
	String FirstName = "Pragati" ;
	String LastName = "Gautam";
	int ssn = 668;
	
	public void FullName() {
		System.out.println(this.FirstName+this.LastName);
	}
	
}

//creating class for child class 

class teacher extends student{
	int salary = 50000;
	
	public void DisplaySalary() {
		System.out.println(this.salary);
	}
}
