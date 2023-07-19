package two;

public class Program3 {

	public static void main(String[] args) {
		
		Student01 Prag1 = new Student01 ("Pragati", "Gautam", 12345);
		System.out.println(Prag1.FirstName);
		System.out.println(Prag1.LastName);
		System.out.println(Prag1.SSN);
		Prag1.FullName();
		
		
		
		
		Teacher01 Prag2 = new Teacher01 ("Pragati", "Gautam", 12345, 100000);
		System.out.println(Prag2.FirstName);
		System.out.println(Prag2.LastName);
		System.out.println(Prag2.SSN);
		System.out.println(Prag2.Salary);
		Prag2.FullName();
		Prag2.DisplaySalary();
		
		
		
		
		Professor01 Prag3 = new Professor01 ("Pragati", "Gautam", 12345, 100000, 5);
		System.out.println(Prag3.FirstName);
		System.out.println(Prag3.LastName);
		System.out.println(Prag3.SSN);
		System.out.println(Prag3.Salary);
		System.out.println(Prag3.NumOfSubjects);
		Prag3.FullName();
		Prag3.DisplaySalary();
		Prag3.DisplayNS();
		
		
	}

}

class Student01{
	String FirstName;
	String LastName;
	int SSN;
	
	public Student01(String FN, String LN, int SN) {
		this.FirstName = FN;
		this.LastName = LN;
		this.SSN = SN;
	}
	
	public void FullName() {
		System.out.println(this.FirstName + this.LastName);
	}
}



class Teacher01 extends Student01{
	int Salary;
	
	public Teacher01(String FN, String LN, int SN, int SL) {
		super (FN,LN,SN);
		this.Salary = SL;
	}
	
	public void DisplaySalary() {
		System.out.println(this.Salary);
	}
	
}




class Professor01 extends Teacher01{
	int NumOfSubjects;
	
	
	public Professor01(String FN, String LN, int SN, int SL, int NS) {
		super(FN, LN, SN, SL);
		this.NumOfSubjects = NS;
		
	}
	
	public void DisplayNS() {
		System.out.println("I teach 5 subjects.");
	}

	
	
	
}
