package two;

public class Rev4Examconstru {

	public static void main(String[] args) {
		
		StudentPG pragati = new StudentPG("Pragati", "Gautam", 23);
		System.out.println(pragati.SAge);
		System.out.println(pragati.SFirstName);
		System.out.println(pragati.SLastName);
		
		pragati.DisplayFullName();
		
		
		TeacherPG Pragatii = new TeacherPG ("Pragati", "Gautam", 23, 100000, "Java");
		System.out.println(Pragatii.SAge);
		System.out.println(Pragatii.Salary);
		System.out.println(Pragatii.SFirstName);
		System.out.println(Pragatii.SLastName);
		System.out.println(Pragatii.Subject);
		
		
		Pragatii.DisplayFullName();
		
		Pragatii.DisplaySalary();
		
		
		ProfessorPG Pragatiii = new ProfessorPG ("Pragati", "Gautam", 23, 120000, "Java", 5);
		
		System.out.println(Pragatiii.NumberOfSubject);
		System.out.println(Pragatiii.SAge);
		System.out.println(Pragatiii.Salary);
		System.out.println(Pragatiii.SFirstName);
		System.out.println(Pragatii.SLastName);
		
		Pragatiii.DisplayNumberOfSubject();
		Pragatiii.DisplaySalary();
		

	}

}

class StudentPG {
	String SFirstName;
	String SLastName;
	int SAge;
	
	public  StudentPG(String SFN, String SLN, int AG) {
	this.SFirstName = SFN;
	this.SLastName = SLN;
	this.SAge = AG;
	}
	
	public void DisplayFullName() {
		System.out.println(this.SFirstName+this.SLastName);
	}
}


class TeacherPG extends StudentPG{
	int Salary;
	String Subject;
	
	public TeacherPG(String SFN, String SLN, int AG, int SL, String SB) {
		super (SFN,SLN,AG);
		this.Salary = SL;
		this.Subject = SB;
	}
	
	public void DisplaySalary() {
		System.out.println("my salary is 100000");
	}
	
	
	
	
}


class ProfessorPG extends TeacherPG{
	int NumberOfSubject;
	
	
	public ProfessorPG(String SFN, String SLN, int AG, int SL, String SB, int NOS) {
		super (SFN,SLN,AG,SL,SB);
		this.NumberOfSubject=NOS;
	}
	
	
	public void DisplayNumberOfSubject() {
		System.out.println(this.NumberOfSubject);
	}
	
	public void DisplaySalary() {
		System.out.println("my salary is 120000");
		
		
//		super.DisplaySalary();
		
		
	}
	
	
	
	
	
}

























