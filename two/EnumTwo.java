package two;
enum BurgerType{
	Normal, Spicy, MediumSpicy, ExtraSpicy
}
class Food{
	BurgerType SpiceAmount;
	public Food(BurgerType SPA) {
		this.SpiceAmount = SPA;
	}
	
	public void ConfirmMessage() {
		switch (SpiceAmount) {
		case Normal:
			System.out.println("Your burger is normal spicy");
			break;
		case Spicy:
			System.out.println("Your burger is spicy");
			break;
		case MediumSpicy:
			System.out.println("Your burger is Medium Spicy");
			break;
		case ExtraSpicy:
			System.out.println("Your burger is Extra spicy");
			break;
		}
		//no need of default because the value will only come from BurgerType???!!!
	}
}

public class EnumTwo {

	public static void main(String[] args) {
		Food Bg = new Food(BurgerType.ExtraSpicy);
		Bg.ConfirmMessage();
		

	}

}
