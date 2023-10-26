package Revisions;

enum A{
	SMALL, MEDIUM, LARGE, EXTRALARGE;


public void mtd() {
	switch(this) {
	case SMALL:
		System.out.println("small tshirt");
		break;
	case MEDIUM:
		System.out.println("medium tshirt");
		break;
	case LARGE:
		System.out.println("large tshirt");
		break;
	case EXTRALARGE:
		System.out.println("extralarge tshirt");
		break;
		default:
			System.out.println("doesnt exist");
	}
	
		
	
}
}

public class Enum123 {

	public static void main(String[] args) {
		A.LARGE.mtd();
		

	}

}
