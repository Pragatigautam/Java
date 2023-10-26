package Revisions;

enum spicy{
	NOSPICE,NORMAL, MEDIUMSPICY, EXTRASPICY;
}
public class EnumClass {

	public static void main(String[] args) {
		
		Burger b = new Burger(spicy.EXTRASPICY);
		b.getMessage();
		

	}

}


class Burger{
	spicy hamBurger;
	
	public Burger(spicy Hm) {
		this.hamBurger = Hm;
	}
	
	public void getMessage() {
		switch(hamBurger) {
		case NOSPICE:
			System.out.println("Not spicy at all.");
			break;
		case NORMAL:
			System.out.println("Its normal spicy.");
			break;
		case MEDIUMSPICY:
			System.out.println("Its medium spicy");
			break;
		case EXTRASPICY:
			System.out.println("its too spicy.");
			break;
			default:
				System.out.println("Doesnt exist.");
			
			
		
		}
	}
}