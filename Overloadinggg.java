
public class Overloadinggg {

	public static void main(String[] args) {
		Add(12,43,54,90);
		
	}
	public static void Add(int a, int b) {
		System.out.println(a+b);
		
	}
	
	public static void Add(int a, int b, int c) {
		System.out.println(a+b+c);
	}
	
	public static void Add(int a, int b, int c , int d){
		System.out.println(a+b+c+d);
	}

}
