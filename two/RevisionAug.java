package two;
enum TshirtSize{
	ExtraSmall, Small, Medium, Large, ExtraLarge;
	
	public String getSize() {
		switch(this) {
		case ExtraSmall:
			return "10 years old";
		case Small:
			return "15 years old";
		case Medium:
			return "20 years old";
		case Large:
			return "25 years old";
		case ExtraLarge:
			return "30 years old";
			default:
				return null;
			
		}
		
	}
	
}
public class RevisionAug {

	public static void main(String[] args) {
		String Age = TshirtSize.ExtraSmall.getSize();
		System.out.println(Age);
		
			
		
	
		
		
		
		

	}

}

