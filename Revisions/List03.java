package Revisions;

import java.util.Arrays;
import java.util.List;

public class List03 {
	
public static void main(String[] args) {
	Names []Students= { new Names(12, "Sarthak"),
			new Names(23, "Uma"),
			new Names(24, "Saroj")
			
	};
	
	List<Names> NameAsList = Arrays.asList(Students);
	NameAsList.stream().forEach(a->a.increaseAge(5));
	
	for(Names std:NameAsList) {
		System.out.println(std.Age);
	}
		

	}

}
class Names{
	int Age;
	String Name;
	public Names(int Ag, String Nm) {
		this.Age = Ag;
		this.Name = Nm;
		
	}
	
	public void increaseAge(int x) {
		this.Age = this.Age +x;
		
	}
}
