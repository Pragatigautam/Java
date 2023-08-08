package two;

public class July23Program7 {

	public static void main(String[] args) {
		VehiclePG XYZ = VehiclePG.getinstance();
		XYZ.getNV();
	}

}

class VehiclePG{
	//make a private reference variable
	private  static VehiclePG NV;
	//static is used to call something on the class level
	//NV is reference variable for an object (because you cann't create an object yet)
	
	
	//make a private constructor
	//it is private so cannot call outside the class
	private VehiclePG() {
		
	}
	
	//make a static method which returns vehiclePG object
	public static VehiclePG getinstance() {
		if (NV==null) {
			NV = new VehiclePG();
		}
		return NV;
	}
	

	//make a method to call on a object
	public void getNV() {
		System.out.println("Congrats on your new vehicle");
	}
	

}
