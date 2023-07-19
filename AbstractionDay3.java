
public class AbstractionDay3 {

	public static void main(String[] args) {
		
		ToyotaV Rav4 = new ToyotaV(4);
		System.out.println(Rav4.NumOfWheel);
		Rav4.brake();
		
		
		
	

}
}

abstract class VehiclesPO{
	int NumOfWheel;
	
	
	public VehiclesPO (int NW) {
		this.NumOfWheel = NW;
	}
	abstract void brake();
}


class ToyotaV extends VehiclesPO{

	public ToyotaV(int NW) {
		super(NW);
		
	}
	
	public void brake () {
		System.out.println("this is a breake method");
	}
	
	
	
	
	
}
