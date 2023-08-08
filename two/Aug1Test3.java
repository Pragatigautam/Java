package two;
enum FamHeight{
	Tall, Shortt, medium;
	
}

public class Aug1Test3 {

	public static void main(String[] args) {
		
		Family Brother = new Family(FamHeight.Tall);
		Brother.DisplayMessage();
			
		
		
		

	}

}
class Family{
	FamHeight Height;
	
	public Family(FamHeight Ht) {
		this.Height = Ht;
	}
		
		public void DisplayMessage() {
		
		switch(Height) {
		case Tall:
			System.out.println("That would be my brother");
			break;
		case medium:
			System.out.println("That's probably my Dad");
			break;
		case Shortt:
			System.out.println("That's definitly me");
			break;
		}
			
		
		
	}
}

