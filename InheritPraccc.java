
public class InheritPraccc {

	public static void main(String[] args) {
		
		//creating object
		
		TeacherQ Rita = new TeacherQ("Rita", "Khatiwada", 42, 100000);
		
		//printing properties with sysout
		System.out.println(Rita.Age);
		System.out.println(Rita.FName);
		System.out.println(Rita.LName);
		System.out.println(Rita.Salary);
		
		
		//printing methods
		
		
		Rita.DisplayFullName();
		

	}

}

//creating class for parent class 

class StudentQ{
	String FName;
	String LName;
	int Age;
	
	public StudentQ(String FN, String LN, int AG) {
		this.FName = FN;
		this.LName = LN;
		this.Age = AG;
	}
	
	public void DisplayFullName() {
		System.out.println(this.FName + this.LName);
	}
	
}


//creating class for child class

class TeacherQ extends StudentQ{
	int Salary;
	
	public TeacherQ(String FN, String LN, int AG, int SL) {
		super(FN, LN,AG);
		this.Salary = SL;
		
	}
	
	
	//overridding
	public void DisplayFullName() {
		System.out.println("Mrs Rita Khatiwada");
		super.DisplayFullName();
	}
	
	
}
