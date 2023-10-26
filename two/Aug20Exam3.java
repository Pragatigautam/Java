package two;

public class Aug20Exam3 {

	public static void main(String[] args) {
		
		Student10 S1 = new Student10(20, "Pragati", "Gautam");
		System.out.println(S1.Age);
		System.out.println(S1.FirstName);
		System.out.println(S1.LastName);
		S1.displayFullName();
		
		
		Teacher10 T1 = new Teacher10(23, "Pragati", "Gautam", 10000, "Java");
		System.out.println(T1.Age);
		System.out.println(T1.FirstName);
		System.out.println(T1.LastName);
		System.out.println(T1.Salary);
		System.out.println(T1.Major);
		T1.getSalary();
		T1.displayFullName();
		

	}

}
class Student10{
	int Age;
	String FirstName;
	String LastName;
	
	public Student10(int Ag, String FN, String LN) {
		this.Age = Ag;
		this.FirstName= FN;
		this.LastName = LN;
	}
	
	public void displayFullName() {
		System.out.println(this.FirstName+" "+this.LastName);
	}
}

class Teacher10 extends Student10{
	int Salary;
	String Major;
	
	public Teacher10(int Ag, String FN, String LN, int Sl, String Mj) {
		super(Ag, FN, LN);
		this.Salary=Sl;
		this.Major=Mj;
		
	}
	public void getSalary() {
		System.out.println(this.Salary);
	}
}
