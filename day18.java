
public class day18 {

	public static void main(String[] args) {
		Vehicle v1 = new Vehicle();
		Vehicle v2 = new Vehicle("Audi");
		Vehicle v3 = new Vehicle("Audi","Q4");

	}
	
	

}

class Vehicle {
	
	String name;
	String model;
	
	
	
	
	public Vehicle() {
		System.out.println("Default constructor is called");
	}
	
	public Vehicle(String nm) {
		this.name = nm;
		System.out.println("The name of vehicle "+ this.name);
	}
	
	public Vehicle(String nm , String mdl) {
		this.name = nm;
		System.out.println("The name of vehicle "+ this.name + this.model);

	}

}
