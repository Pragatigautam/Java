package two;
enum Size8{
	SMALL, MEDIUM, LARGE, EXTRALARGE;
	
	public void getMessage() {
		switch(this) {
		case SMALL:
			System.out.println("this is a small size tshirt.");
			break;
		case LARGE:
			System.out.println("this is a large size tshirt.");
			break;
		case MEDIUM:
			System.out.println("this is a medium size tshirt.");
			break;
		case EXTRALARGE:
			System.out.println("this is a extra large size tshirt.");
			break;
			default:
				System.out.println("This tshirt size doesn't exist.");
		}
	}
}

public class Aug20Exam9 {

	public static void main(String[] args) {
		Size8.LARGE.getMessage();
		

	}

}
