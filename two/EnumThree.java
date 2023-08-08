package two;
enum Size{
	Small, Medium, Large, ExtraLarge;
	
	public int getSize() {
		switch (this) {
		case Small:
			return 5;
		case Medium:
			return 6;
		case Large:
			return 7;
		case ExtraLarge:
			return 10;
			default:
				return 0;
		}
	}
}

public class EnumThree {

	public static void main(String[] args) {
		int Tshirt = Size.Large.getSize();
		System.out.println(Tshirt);
		

	}

}
