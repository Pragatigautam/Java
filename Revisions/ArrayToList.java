package Revisions;

import java.util.Arrays;
import java.util.List;

public class ArrayToList {

	public static void main(String[] args) {
		Employees[] AEmployees  = {
				new Employees(1000, "Pragati"),
				new Employees(2000, "Biolov"),
				new Employees(2300, "Prajwol")
				
		};
		
		List<Employees> empList = Arrays.asList(AEmployees);
		
		empList.stream().forEach(a->a.IncreaseSalary(100));
		
		for(Employees abc: empList) {
			System.out.println(abc.Salary);
		}
	
		
		

		

	}

}
class Employees{
	int Salary;
	String Name;
	
	public Employees(int Sl, String Nm) {
		this.Salary = Sl;
		this.Name = Nm;
	}
	
	public void IncreaseSalary(int x) {
		this.Salary = this.Salary + x;
	}
}
