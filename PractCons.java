
public class PractCons {

	public static void main(String[] args) {
		birds parrot = new birds(2, "cutie", 'a');
		
		System.out.println(parrot.name);
		System.out.println(parrot.type);
		
		parrot.sing();
		int sum = parrot.seed(2, 4);
		System.out.println(sum);
	
		

	}

}
class birds{
	int age;
	String name;
	char type;
	
	
	public birds(int ag, String nm, char ty) {
		this.age= ag;
		this.name=nm;
		this.type=ty;
	}
	
	public void sing()
	{
		System.out.println("parrot can sing very nice");
	}
	public int seed(int x, int y) {
		return x+y;
	}
		
	
	
	
}
