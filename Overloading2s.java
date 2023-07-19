
public class Overloading2s {

	public static void main(String[] args) {
		
		Subs (100,200,2034);
		

	}


	
	//Overloading has same class , same method but different signatures (parameters)

public static void Subs(int x, int y) {
	
	System.out.println(x - y);
	
}

public static void Subs(int x, int y, int z) {
	
	System.out.println(x - y - z);
	
}

public static void Subs(int x, int y, int z, int a) {
	
	System.out.println(x - y - z - a);
	
}

}
