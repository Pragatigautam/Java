package two;

public class Revision123 {

	public static void main(String[] args) {
		
		//inheritance with constructor
		//creating object for Student class which is parent class
		
		StudentO Rita = new StudentO("Rita", "Khatiwoda", 43);
		Rita.DisplayName();
		System.out.println(Rita.age);
		System.out.println(Rita.FirstName);
		System.out.println(Rita.LastName);
		
		
		
		//creating object for TeacherO class which is child class
		
		TeacherO RitaT = new TeacherO("Rita", "Khatiwoda", 43, 100000);
		System.out.println(RitaT.age);
		System.out.println(RitaT.FirstName);
		System.out.println(RitaT.LastName);
		RitaT.DisplayName();
		RitaT.DisplaySalary();
		
		
		
		

	}

}
//creating class for parent class
class StudentO{
	String FirstName;
	String LastName;
	int age;
	
	public StudentO(String FN, String LN, int AG) {
		this.FirstName = FN;
		this.LastName = LN;
		this.age = AG;
		
	}
	
	public void DisplayName() {
		System.out.println(this.FirstName + this.LastName);
		
	}
	
	
	
	
	
}

//creating class for child class


class TeacherO extends StudentO{
	int salary;
	
	public TeacherO(String FN, String LN, int AG, int SL) {
		super (FN,LN,AG);
		this.salary = SL;
	}
	
	public void DisplaySalary() {
		System.out.println(this.salary);
	}
}


//overridding


//father parent class
//raksi khancha
//last name giri



//son
//last name
//raksi khadaina
//juice khancha
















