package two;

public class RevisionSwitch4 {

	public static void main(String[] args) {
		String city = "lalitpur";
		
		
		
		switch (city) {
		case  ("irving"):
		case ("dallas"):
			System.out.println("tx");
		
		break;
		case ("boston"):
		case ("salem"):
		System.out.println("MS");
		break;
		
		case ("kathmandu"):
		case ("lalitpur"):
			System.out.println("nepal");
		break;
		default:
			System.out.println("invalid input");
			
		}
		
		
		
		int dayName = 14;
		switch (dayName){
		
		
		
		case (1):
			System.out.println("sunday");
		break;
		
		case (2):
			System.out.println("monday");
		break;
		case (3):
			System.out.println("tuesday");
		break;
		case(4):
			System.out.println("wednesday");
		break;
		case(5):
			System.out.println("thursday");
		break;
		case(6):
			System.out.println("friday");
		break;
		case(7):
			System.out.println("saturday");
		break;
		default:
			System.out.println("invalid day name");
		}
		
		
		

	}


	
}
