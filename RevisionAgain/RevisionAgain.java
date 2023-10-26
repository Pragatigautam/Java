package RevisionAgain;

import java.util.Arrays;
import java.util.List;

public class RevisionAgain {

	public static void main(String[] args) {
		Employee []E= {
				new Employee(1000, "Employee1"),
				new Employee(2000, "Employee2"),
				new Employee(3000, "Employee3"),
		};
		
		List<Employee> A=Arrays.asList(E);
		A.stream().forEach(a->a.increaseSal(100));
		for(Employee a:A) {
			System.out.println(a.salary);
		}
		

		
		
		
	}

}

class Employee{
	int salary;
	String Name;
	public Employee(int SL, String NM) {
		this.salary=SL;
		this.Name=NM;
	}
	public void increaseSal(int x) {
		this.salary= this.salary+x;
		
	}
}




