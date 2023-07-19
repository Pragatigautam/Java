
public class InheriPT12 {

	public static void main(String[] args) {
		
		Dog simba = new Dog();
		simba.display();
		simba.DisplayD();
		

	}

}

class Animal{
	public void display() {
		System.out.println("i am an animal");
		
	}
}

class Dog extends Animal{
	public void DisplayD() {
		System.out.println("i am a dog");
	}
	
	public void DisplayMessage() {
		display();
		super.display();
	}
}
