package two;

import java.util.HashMap;
import java.util.Map;


public class Aug7Test2 {

	public static void main(String[] args) {
		HashMap<String ,Integer> Vehcles = new HashMap<>();
		Vehcles.put("Camry", 12344);
		Vehcles.put("CRV", 345677);
		Vehcles.put("VW", 2335464);
		
		System.out.println(Vehcles);
		
		for(String A:Vehcles.keySet()) {
			System.out.println(A);
		}
		
		for(Integer A:Vehcles.values()) {
			System.out.println(A);
		}
	 
	        
	  }

	
		

	}


