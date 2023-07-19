
public class UserDefinedDataTypee {

	public static void main(String[] args) {
		Human pragati = new Human();
		System.out.println(pragati.age);
		System.out.println(pragati.name);
		pragati.walk();
		pragati.talk();
		
		
		pragati.age= 23;
		pragati.name = "pragati gautam";
		
		System.out.println(pragati.age);
		System.out.println(pragati.name);
		
		
		//creating another object
		Human Biplov = new Human();
		System.out.println(Biplov.age);
		System.out.println(Biplov.name);
		Biplov.walk();
		Biplov.talk();
		
		Biplov.age= 22;
		Biplov.name = "Biplov Adhikari";
		
		System.out.println(Biplov.name);
		System.out.println(Biplov.age);
		Biplov.walk();
		Biplov.talk();
		
		//u should be able to define it at the time of obj creation
		
		
	


	}
	


}



class Human {
	int age;
	String name;
	
	public void talk() {
		System.out.println("i can talk");
	}
	
	public void walk() {
		System.out.println("i can  walk");
	}
}