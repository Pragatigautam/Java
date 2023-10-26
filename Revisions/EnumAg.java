package Revisions;
enum Size{
	SMALL, MEDIUM, LARGE, EXTRALARGE;
}

public class EnumAg {

	public static void main(String[] args) {
		Tshirts9 T = new Tshirts9(Size.LARGE);
		T.getMessage();
		

	}

}
class Tshirts9{
	
	Size Allsizes;
	
	public Tshirts9(Size AS) {
		this.Allsizes=AS;
	}
	
	public void getMessage() {
		switch(Allsizes) {
		case SMALL:
			System.out.println("Small Tshirt.");
			break;
		case MEDIUM :
			System.out.println("Medium Tshirt.");
			break;
		case LARGE:
			System.out.println("Large Tshirt.");
			break;
		case EXTRALARGE:
			System.out.println("EXTRALARGE Tshirt.");
			break;
			default:
				System.out.println("Doesn't exist.");
		}
	}
	
}
