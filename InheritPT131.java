
public class InheritPT131 {

	public static void main(String[] args) {
		
		AnimalB simba = new AnimalB(2);
		
		
		simba.displayAge();
		simba.displayMessage();
		
		
		int Agee = simba.updateAge(3);
		System.out.println(Agee);
		
		
		
		

	}

}

class AnimalB{
	private int age;
	
	public AnimalB(int AG) {
		this.age=AG;
	}
	
	private String displayName() {
		return "i am dog";
	}
	
	public void displayAge() {
		System.out.println(this.age);
	}
	
	public int updateAge(int updateAge) {
		this.age=updateAge;
		return this.age;
				
	}
	
	public void displayMessage() {
		String Message = displayName();
		System.out.println(Message);
			
	}
}
