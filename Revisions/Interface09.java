package Revisions;
interface abc{
	public void M1();
	public void M2();
	public void M3();
		
	
}

public class Interface09 {

	public static void main(String[] args) {
		
		abc OBJ;
		
		C1 obj = new C1();
		C1.M1();
		

	}

}

class C1 implements abc{

	@Override
	public void M1() {
		System.out.println("Method 1");
		
	}

	@Override
	public void M2() {
		System.out.println("Method 2");
		
	}

	@Override
	public void M3() {
		System.out.println("Method 2");
		
	}
	
}
