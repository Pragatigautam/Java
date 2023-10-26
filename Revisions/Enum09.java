package Revisions;
enum Size9{
	SMALL, MEDIUM, LARGE, EXTRALARGE;
	
	public void EnumMethod() {
	
	switch(this) {
	case SMALL:
		System.out.println("Small tshirt.");
		break;
	case MEDIUM:
		System.out.println("Medium Tshirt.");
		break;
	case LARGE:
		System.out.println("Large Tshirt.");
		break;
	case EXTRALARGE:
		System.out.println("Extra large tshirt.");
		break;
		default:
		System.out.println("Doesn't exist.");
		
	}
}
}

public class Enum09 {

	public static void main(String[] args) {
		
		Size9.EXTRALARGE.EnumMethod();
		

	}

}
