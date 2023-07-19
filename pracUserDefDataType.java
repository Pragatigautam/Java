
public class pracUserDefDataType {

	public static void main(String[] args) {
		animals dog = new animals();
		dog.age=3;
		dog.name="simba";
		System.out.println(dog.name);
		System.out.println(dog.age);
		
		dog.eat();
		dog.run();
		
		

	}

}

class animals{
	int age;
	String name;
	
	
	
	public void run() {
		System.out.println("simba can run");
		
	}
	public void eat() {
		System.out.println("simba likes to eat");
	}
	
}
