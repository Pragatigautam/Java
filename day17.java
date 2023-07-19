
public class day17 {

	public static void main(String[] args) {
		//program 1 write program for creating 5 object and constructor
		person [] students = {new person ("pragati", "gautam", 23), new person ("prajwol", "gautm", 28), new person ("biplov", "adh", 22), new person ("bipisha", "adhikari", 20)
	};
		//for loop
		for (int i=0; i<students.length; i++) {
			students[i].displayName();
		}
		
		//while loop
		int t1 = 0;
		while (t1 < students.length) {
			students[t1].displayName();
			t1++;
		}
		
		//for each loop
		for (person student : students) {
			student.displayName();
		}
		
		
		//program 2
		Calculator june = new Calculator();
		june.addition(2, 3); // 5
		june.addition(2, 3, 4); // 9
		june.addition(2, 3, 4, 5); //14

	}

    }
		



class person{
	String firstName;
	String lastName;
	int age;

public person(String fn, String ln, int ag) {
	this.firstName = fn;
	this.lastName = ln;
	this.age = ag;
}

public void displayName() {
	System.out.println(this.firstName + this.lastName);
}

}


//program 2 constructor
class Calculator {

	public void addition(int x, int y) {
		System.out.println(x + y);
	}

	public void addition(int x, int y, int z) {
		System.out.println(x + y + z);
	}

	public void addition(int x, int y, int z, int a) {
		System.out.println(x + y + z + a);
	}

}
