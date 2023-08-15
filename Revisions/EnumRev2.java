package Revisions;
enum size2{
	extraSmall, small, medium, large, extraLarge;
}

public class EnumRev2 {

	public static void main(String[] args) {
	Tshirt2 T1 = new Tshirt2(size2.medium);
	T1.displayMsg();

	}

}

class Tshirt2{
	size2 Luga;
	
	public Tshirt2(size2 Lg) {
		this.Luga = Lg;
	}
	
	public void displayMsg() {
		switch(Luga) {
		case extraSmall:
			System.out.println("Tshirt is extra small.");
			break;
		case small:
			System.out.println("Tshirt is small");
			break;
		case medium:
			System.out.println("Tshirt is medium");
			break;
		case large:
			System.out.println("Tshit is large");
			break;
		case extraLarge:
			System.out.println("Tshirt is extra large");
		break;
		}
	}
}
