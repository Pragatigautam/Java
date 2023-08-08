package two;
enum Pizza{
	Normal, Spicy, MediumSpicy, ExtraSpicy
}
public class Aug1Test4 {

	public static void main(String[] args) {
		PizzaF Bg = new PizzaF(Pizza.ExtraSpicy);
		Bg.ConfirmMessage();

	}

}
class PizzaF{
	Pizza SpiceAmount;
	public PizzaF(Pizza SPA) {
		this.SpiceAmount = SPA;
	}
	
	public void ConfirmMessage() {
		switch (SpiceAmount) {
		case Normal:
			System.out.println("Your pizza is normal spicy");
			break;
		case Spicy:
			System.out.println("Your pizza is spicy");
			break;
		case MediumSpicy:
			System.out.println("Your pizza is Medium Spicy");
			break;
		case ExtraSpicy:
			System.out.println("Your pizza is Extra spicy");
			break;
		}
		
	}
}
