
public class UserDefinedDTP2 {

	public static void main(String[] args) {
		Birds parrot = new Birds("parrot gi", 1);
		Birds sparrow = new Birds("sparrow jack", 2);
		
		System.out.println(sparrow.age);
		System.out.println(sparrow.name);
		System.out.println(parrot.name);
		System.out.println(parrot.age);
		
		String a= parrot.sing();
		
			System.out.println(a);
		
				
		
			String b = sparrow.sing();
			System.out.println(b);
		

	
	}

}

class Birds{
	int age;
	String name;
	
	public Birds (String BNm, int BAg) {
		this.name= BNm;
		this.age= BAg;
	}
	
	public String sing() {
		return "i can sing"; 
	}
	public void fly() {
		System.out.println("i can fly");
	}
}
