package Revisions;
enum Size08{
	SMALL, MEDIUM, LARGE, EXTRALARGE;
}

public class Enum08 {

	public static void main(String[] args) {
		
		Tshirt08 Tee = new Tshirt08(Size08.LARGE);
		Tee.getMessage();
		
		

	}

}
class Tshirt08{
	Size08 AllSizes;
	
	public Tshirt08(Size08 AS) {
		this.AllSizes = AS; 
	}
	public void getMessage() {
		switch(AllSizes) {
		case SMALL:
			System.out.println("Small size tshirt.");
			break;
		case MEDIUM:
			System.out.println("Medium size tshirt.");
			break;
		case LARGE:
			System.out.println("Large size tshirt.");
			break;
		case EXTRALARGE:
			System.out.println("ExtraLarge size tshirt.");
			break;
			default:
				System.out.println("Doesn't exist.");
		
		}
	}
}

