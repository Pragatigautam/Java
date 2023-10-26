package Revisions;

import java.util.Arrays;
import java.util.List;

public class List05 {

	public static void main(String[] args) {
		Students09 []student = {
				new Students09(12, "Pragati"),
				new Students09(13, "Biplov"), 
				new Students09(17, "Prajwol")
				
		};
		List<Students09> StdList = Arrays.asList(student);
		StdList.stream().forEach(a->a.getAge(5));
		
		for(Students09 abc: StdList) {
			System.out.println(abc.Age);
		}
		

	}

}
class Students09{
	int Age;
	String Name;
	 public Students09(int Ag, String Nm) {
		 this.Age = Ag;
		 this.Name = Nm;
	 }
	 public void getAge(int x) {
		 this.Age = this.Age +x;
	 }
}
