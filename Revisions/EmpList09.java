package Revisions;

import java.util.Arrays;
import java.util.List;

public class EmpList09 {

	public static void main(String[] args) {
		Employees0 [] E = {
				new Employees0(1000, "Pragati"),
				new Employees0(2000, "Biplov"),
				new Employees0(3000, "Prajwol")
				
		};
		
		List<Employees0> empList = Arrays.asList(E);
		
		empList.stream().forEach(a->a.IncreaseSalary(1000));
		
		for(Employees0 a: empList) {
			System.out.println(a.Salary);
		}
		

	}

}

class Employees0{
	int Salary;
	String Name;
	
	public Employees0(int Sl, String Nm) {
		this.Salary = Sl;
		this.Name = Nm;
	}
	
	public void IncreaseSalary(int x) {
		this.Salary = this.Salary +x;
	}
}
