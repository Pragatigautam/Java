package two;

import java.util.Arrays;
import java.util.List;

public class MapAlist {

	public static void main(String[] args) {
		Employee[] employees = {
				new Employee(1, "Pragati Gautam", 1000000),
				new Employee(2, "Biplov Adhikari", 10000000),
				new Employee(3, "Prajwol Gautam", 1000000000)
		};
		 
		//to conver employee array as a list called emplist (Employee is data type from class Employee)
		List<Employee> emplist = Arrays.asList(employees); 
		
		//for each
		emplist.stream().forEach(emp -> emp.incrementSalary(10));
		for(int i=0; i<employees.length; i++) {
			System.out.println(employees[i].Salary);
		}
		
		
 
	}

}
class Employee{
	int id;
	String fullName;
	int Salary;
	
	
	public Employee(int id, String FN, int Sy) {
		this.id = id;
		this.fullName = FN;
		this.Salary = Sy;
	}
	public void displayFullName() {
		System.out.println(this.fullName);
	}
	public void incrementSalary(int x) {
		this.Salary = this.Salary + x;
	}
}
