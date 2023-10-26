package Revisions;

import java.util.Arrays;
import java.util.List;

public class List04 {

	public static void main(String[] args) {
		
		Students05 []student = { new Students05(15, "Sarthak"),
				new Students05(16, "Sofia"),
				new Students05(18, "Biplov"),
				new Students05(19, "Pragati")
		
		};
		
		List<Students05> ArrayToList = Arrays.asList(student);
		ArrayToList.stream().forEach(a->a.increaseAge(5));
		
		for(Students05 abc:ArrayToList) {
			System.out.println(abc.Age);
		}
		

	}

}
class Students05{
	int Age;
	String Name;
	
	public Students05(int Ag, String Nm) {
		this.Age = Ag;
		this.Name = Nm;
		
	}
	
	public void increaseAge(int x) {
		this.Age = this.Age + x;
		
		
	}
}
