package Revisions;

enum Types{
	SMALL, MEDIUM, LARGE, EXTRALARGE;
}

public class EnumFive {

	public static void main(String[] args) {
		
		Tshirts T = new Tshirts(Types.LARGE);
		T.getMsg();
		

	}

}

class Tshirts{
	Types Tees;
	
	public Tshirts(Types TS) {
		this.Tees = TS;
	}
	
	public void getMsg() {
		switch(Tees) {
		case SMALL:
			System.out.println("small size tshirt.");
			break;
		case MEDIUM:
			System.out.println("medium size tshirt.");
			break;
		case LARGE:
			System.out.println("large size tshirt.");
			break;
		case EXTRALARGE:
			System.out.println("extra large size tshirt.");
			break;
			default:
				System.out.println("doesnt exist.");
				
				
		}
	}
}

