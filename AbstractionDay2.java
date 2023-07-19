
public class AbstractionDay2 {

	public static void main(String[] args) {
		
		TheDog simba = new TheDog();
		simba.dance();
		simba.Name();
	
		

	}

}
abstract class AnimalssO{
	abstract void dance();
	public void Name() {
		System.out.println("my name is simba, i am a dog");
	}
	
}

class TheDog extends AnimalssO{
	public void dance() {
		System.out.println("i can dance");
	}
	
}
