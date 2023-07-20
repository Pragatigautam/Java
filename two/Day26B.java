package two;
class A{
	public void GreetA() {
		System.out.println("Hi");
	}
	
}
class B{
	public void GreetB() {
		System.out.println("Bye");
	}
	
}

// only one class can be inherited in the child class
class C extends A{
	
	
}
public class Day26B {

	public static void main(String[] args) {
		C Apple = new C();
		Apple.GreetA();
		

	}

}

