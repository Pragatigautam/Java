package Revisions;

enum Type{
	SMALL, MEDIUM, LARGE, EXTRALARGE;
}

public class Enums {

	public static void main(String[] args) {
		
		Tshirt T = new Tshirt(Type.LARGE);
		T.getMsg();
		

	}

}

class Tshirt{
	Type Size;
	
	public Tshirt(Type SZ) {
		this.Size = SZ;
	}
	
	public void getMsg() {
		switch(Size) {
		case SMALL:
			System.out.println("small tshirt");
			break;
		case LARGE:
			System.out.println("large tshirt");
			break;
		case MEDIUM:
			System.out.println("medium tshirt");
			break;
		case EXTRALARGE:
			System.out.println("extralarge tshirt");
			break;
			default:
				System.out.println("doesnt exist.");
		}
	}
}


