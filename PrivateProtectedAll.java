
public class PrivateProtectedAll {

	public static void main(String[] args) {
		
		VehicleP ABCD = new VehicleP("white", "pink",6968);
		System.out.println(ABCD.chaseNum);
		
		System.out.println(ABCD.color);
		System.out.println(ABCD.model);
		
		
		ABCD.DisplayClaseNum();
		ABCD.DisplayColor();
		ABCD.DisplayMessage();
		ABCD.Message2();
		
		
		
		Car Audi = new Car("white", "pink",  6968,"Audi", 5);
		System.out.println(Audi.chaseNum);
		System.out.println(Audi.color);
		System.out.println(Audi.model);
		System.out.println(Audi.Name);
		
		Audi.DisplayClaseNum();
		Audi.DisplayColor();
		Audi.DisplayMessage();
		Audi.DisplayWheel();
		Audi.Message2();

		

	}

}
class VehicleP{
	String color;
	String model;
	int chaseNum;
	
	public VehicleP(String CL, String MD, int CN) {
		this.color = CL;
		this.model = MD;
		this.chaseNum = CN;
	}


public void DisplayColor() {
	System.out.println(this.color);
}

public void DisplayClaseNum() {
	System.out.println(this.chaseNum);
}

private void DisplayModelNum() {
	System.out.println(this.model);
}

public void DisplayMessage() {
	System.out.println("Congrats on your new car");
}

protected void Message2() {
	System.out.println("message number 2");
}

}


class Car extends VehicleP{
	String Name;
	private int NumOfWheels;
	
	
	public Car(String CL, String MD, int CN, String NM, int NW) {
		super(CL, MD, CN);
		this.Name = NM;
		this.NumOfWheels = NW;
		
	}
	
	public void LaunchDate(int year) {
		System.out.println(year);
	}
	
	public void LaunchDate(int year, String Month) {
		System.out.println(year);
		System.out.println(Month);
	}
	
	public void LaunchDate(int year, String Month, int Day) {
		System.out.println(year);
		System.out.println(Month);
		System.out.println(Day);
	}
	
	public int DisplayWheel() {
		return this.NumOfWheels;
	}

	
	//overriding the message method from parent class
	
	public void DisplayMessage() {
		System.out.println("Congrats on your new audi");
		super.DisplayMessage();
		this.Message2();
	}
	
	
	
}



