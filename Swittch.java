
public class Swittch {

	public static void main(String[] args) {
		//program 1 switch case without break statement
		String city = "Irving";
		switch (city) {
		case "Irving":
			System.out.println("TX");
		case "LA":
			System.out.println("CA");
		case "Denver":
			System.out.println("CO");
		case "Boston":
			System.out.println("MA");
			default:
				System.out.println("Incorrect city name");
		}
		//program 2 
		String city2 = "Boston";
		switch (city2) {
		case "Irving":
			System.out.println("TX");
			break;
		case "LA":
			System.out.println("CA");
			break;
		case "Denver":
			System.out.println("CO");
		case "Boston":
			System.out.println("MA");
			break;
			default:
				System.out.println("Incorrect city name");
		
		
		}
		//program 3
		
		String city3 = "Salem";
		switch (city3) {
		case "Irving":
		case "Dallas":
			System.out.println("TX");
			break;
		case "LA":
		case "Sandiego":
			System.out.println("CA");
			break;
		case "Denver":
		case "Boulder":
			System.out.println("CO");
			break;
		case "Boston":
		case "Salem":
			System.out.println("MA");
			break;
			default:
				System.out.println("Incorroct city name");
			
		}

	}

}
