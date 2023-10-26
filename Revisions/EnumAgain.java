package Revisions;
enum Size{
	SMALL, MEDIUM, LARGE, EXTRALARGE;
	
}

public class EnumAgain {

	public static void main(String[] args) {
		TshirtR T = new TshirtR(Size.LARGE);
		T.getSize();
				
		

	}

}
class TshirtR{
	Size AllSizes;
	
	public TshirtR(Size AS) {
		this.AllSizes = AS;
	}
	
	public void getSize() {
		switch(AllSizes) {
		case SMALL:
			System.out.println("small Tshirt.");
			break;
		case MEDIUM:
			System.out.println("Medium Tshirt.");
			break;
		case LARGE:
			System.out.println("Large Tshirt.");
			break;
		case EXTRALARGE: 
			System.out.println("Extra Large Tshirt.");
			break;
			default:
				System.out.println("Doesn't exist.");
			
		}
	}
}
