
public class OverloadingDay22 {

	public static void main(String[] args) {
		
		Calculator (12,342,543);
		

	}


	
	//Overloading has same class , same method but different signatures (parameters)

public static void Calculator(int x, int y) {
	
	System.out.println(x + y);
	
}

public static void Calculator(int x, int y, int z) {
	
	System.out.println(x + y + z);
	
}

public static void Calculator(int x, int y, int z, int a) {
	
	System.out.println(x + y + z + a);
	
}

}
