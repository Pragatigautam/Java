package Revisions;

enum Type1{
	SMALL, MEDIUM, LARGE, EXTRALARGE;
}

public class EnumF {

	public static void main(String[] args) {
		Tshirt1 T = new Tshirt1(Type1.LARGE);
		T.getMsg();
		

	}

}
class Tshirt1{
	Type1 Tee;
	
	public Tshirt1(Type1 T) {
		this.Tee = T;
	}
	
	public void getMsg() {
		switch(Tee) {
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
			System.out.println("extralarge size tshirt.");
			break;
			default:
				System.out.println("doesnt exist.");
		}
	}
}
