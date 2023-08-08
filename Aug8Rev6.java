import java.util.Arrays;
import java.util.List;

public class Aug8Rev6 {

	public static void main(String[] args) {
		
		Employee [] Workers = {
				new Employee("Pragati", "Gautam", 12345, 100000),
				new Employee("Sophiya", "Gautam1", 923, 100290),
				new Employee("Sarthak", "Gautam2", 283, 1297121)
		};
		
		
		//looping to print full name or each worker
		for(int i=0; i<Workers.length; i++) {
			Workers[i].FullName();
			
			List<Employee> empList = Arrays.asList(Workers);
			
			empList.stream().forEach(a->a.IncrementalSalary(10000));
			
			for(int i1=0; i1<Workers.length; i1++) {
				System.out.println(Workers[i].Salary);
			}
			
			
			
			
		}
		

	}

}
class Employee{
	String FirstName;
	String LastName;
	int SSN;
	int Salary;
	
	public Employee(String FN, String LN, int SSN, int SL) {
		this.FirstName=FN;
		this.LastName=LN;
		this.SSN=SSN;
		this.Salary=SL;
	}
	public void FullName() {
		System.out.println(this.FirstName+" "+this.LastName);
	}
	public void IncrementalSalary(int a) {
		System.out.println(this.Salary+a);
	}
}
