package two;

public class Test12 {

	public static void main(String[] args) {
		
//		Teacher007 Chinmay = new Teacher007("Chinmay", "Deshpande", 27);
//		System.out.println(Chinmay.Age);
//		System.out.println(Chinmay.FName);
//		System.out.println(Chinmay.LName);
//		
//		
//		Chinmay.DisplayAge();
//		Chinmay.DisplayFullName();
		
		
		Professor007 ChinmaySir = new Professor007("Chinmay", "Deshpande", 27, 1000000);
		System.out.println(ChinmaySir.Age);
		System.out.println(ChinmaySir.FName);
		System.out.println(ChinmaySir.LName);
		System.out.println(ChinmaySir.Salary);
		
		ChinmaySir.DisplaySalary();
		ChinmaySir.DisplayAge();
		ChinmaySir.DisplayFullName();
		ChinmaySir.Subject();
		
		
		

	}

}
abstract class Teacher007 {
	String FName;
	String LName;
	int Age;
	


public Teacher007 (String FN, String LN, int AG) {
	
	//this . is used to refer age and so on
	this.Age = AG;
	this.FName = FN;
	this.LName = LN;
}

public void DisplayFullName(){
	System.out.println(this.FName + this.LName);
}
public void DisplayAge() {
	System.out.println(this.Age);
}

abstract void Subject();


}

class Professor007 extends Teacher007{
	int Salary;
	
	public Professor007 (String FN, String LN, int AG, int SL) {
		super (FN,LN,AG);
		this.Salary = SL;
	}
	
	public void DisplaySalary() {
		System.out.println(this.Salary);
	}
	
	//overriding
	public void DisplayAge() {
		System.out.println("cannot be disclosed");
	}
	
	//abstract method added
	
	public void Subject() {
		System.out.println("Maths");
	}
	
	
	
}


