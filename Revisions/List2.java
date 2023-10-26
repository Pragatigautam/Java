package Revisions;

import java.util.Arrays;
import java.util.List;

public class List2 {

	public static void main(String[] args) {
		
		Students04 []All = {new Students04(23, "Pragati Gautam"),
			
						   new Students04(22, "Biplov Adhikari"),
						   new Students04(28, "Prajwol Gautam")
		};
		
		List<Students04> StdList = Arrays.asList(All);
		
		
		//increase the age of each student by 5 years.
		
		StdList.stream().forEach(a->a.IncAge(5));
		
		
		//looping all student age using for each on StdList list
		for(Students04 student:StdList) {
			System.out.println(student.Age);
		}
		
		//looping all student age using for loop on All array (both same thing)
		for(int i=0; i<All.length; i++) {
			System.out.println(All[i].Age);
		}
		
			
		
		

	}

}
class Students04{
	int Age;
	String Name;
	
	public Students04(int AG, String NM) {
		this.Age = AG;
		this.Name = NM;
	}
	public void IncAge(int x) {
		this.Age = this.Age + x;
	}
}
