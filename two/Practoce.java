package two;

import java.util.Arrays;
import java.util.List;

public class Practoce {

	public static void main(String[] args) {
		Vehicle56[] Veh = {
				new Vehicle56 ("Crown", 39950, "2.4 L 4-cylinder, 2.5 L 4-cylinder"),
				new Vehicle56 ("Camry", 31170, "Straight engine, V engine"),
				new Vehicle56 ("Supra", 64375, "Straight engine")
		};
		//from array to list
		List<Vehicle56>VehList= Arrays.asList(Veh);
		
		VehList.stream().forEach(Veh->Veh)	
		}
		

	}


class Vehicle56{
	String Model;
	int Price;
	String Engine;
	
	public Vehicle56(String M, int P, String E) {
		this.Model = M;
		this.Price = P;
		this.Engine = E;
	}
	public void DisplayPrice() {
		System.out.println(this.Price);
	}
	public void IncrementPrice() {
		
	}
}