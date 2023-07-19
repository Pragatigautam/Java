
public class Consss {

	public static void main(String[] args) {
		StudentW Biplov = new StudentW("Biplov", "Adhikari", 23);
		System.out.println(Biplov.age);
		
		Biplov.DisplayName();
		
		
		TeacherW Biplovv = new TeacherW("Biplov", "Adhikari", 23, 100000);
		System.out.println(Biplovv.age);
		System.out.println(Biplovv.FirstName);
		
		Biplovv.DisplaySalary();
	
		

	}

}

class StudentW{
	String FirstName;
	String LastName;
	int age;
	
	public StudentW(String FN, String LN, int AG) {
		this.FirstName = FN;
		this.LastName = LN;
		this.age = AG;
	}
	public void DisplayName() {
		System.out.println(this.FirstName + this.LastName);
	}
	
}

class TeacherW extends StudentW{
	int salary;
	
	public TeacherW(String FN, String LN, int AG, int SL) {
	super(FN,LN,AG);
	
	this.salary = SL;
	}
	
	public void DisplaySalary() {
		System.out.println(this.salary);
	}
}
